#!/bin/bash

# Définition des fichiers Docker Compose
declare -A COMPOSE_FILES
COMPOSE_FILES=(
    ["kafka"]="docker-compose.kafka.yml"
    ["main"]="docker-compose.yml"
    ["spark"]="docker-compose.spark.yml"
    ["airflow"]="docker-compose.airflow.yml"
)

declare -A COMPOSE_DEPENDENCIES
COMPOSE_DEPENDENCIES=(
    ["kafka"]="docker-compose.kafka.yml"
    ["main"]="docker-compose.yml docker-compose.kafka.yml"  # On ajoute kafka à main
    ["spark"]="docker-compose.spark.yml"
    ["airflow"]="docker-compose.airflow.yml"
)

# Vérifier si le réseau existe, sinon le créer
docker network ls | grep -q "cic-shared-network" || docker network create cic-shared-network

# Fonction pour afficher l'usage du script
usage() {
    echo "Usage: $0 {start|stop|restart|status|logs|prune|list|rm|help} [fichier/service]"
    echo "  start [fichier/service]   - Démarrer un fichier compose ou un service spécifique sans arrêter les autres"
    echo "  stop [fichier/service]    - Arrêter un fichier compose ou un service spécifique"
    echo "  restart [fichier/service] - Redémarrer un fichier compose ou un service spécifique"
    echo "  status                    - Voir les services en cours d'exécution"
    echo "  logs [service]            - Voir les logs des services en temps réel"
    echo "  prune                     - Supprimer les conteneurs, volumes et réseaux inutilisés"
    echo "  list                      - Lister les fichiers Docker Compose disponibles"
    echo "  rm [fichier/service/all]  - Supprimer les volumes d'un fichier, d'un service ou tous les volumes"
    echo "  help                      - Afficher la liste des commandes disponibles"
    echo "\n📂 Alias des fichiers Docker Compose disponibles :"
    for key in "${!COMPOSE_FILES[@]}"; do
        echo "  - $key : ${COMPOSE_FILES[$key]}"
    done
    exit 1
}

# Vérifier qu'un argument est passé
if [ -z "$1" ]; then
    usage
fi

# Vérifier si un alias de fichier docker-compose est utilisé
get_compose_files() {
    local alias="$1"
    echo "${COMPOSE_DEPENDENCIES[$alias]}"
}

# Exécuter une action (start, stop, restart) sur un fichier compose ou un service
execute_action() {
    local action="$1"
    local target="$2"

    # Vérifier si le target est un fichier docker-compose alias
    compose_files=$(get_compose_files "$target")

    if [ -n "$compose_files" ]; then
        case "$action" in
            start)
                echo "🚀 Démarrage des fichiers compose: $compose_files sans arrêter les services en cours..."
                docker compose $(echo $compose_files | sed 's/ / -f /g' | sed 's/^/-f /') up -d --no-recreate
                ;;
            stop)
                echo "🛑 Arrêt des fichiers compose: $compose_files..."
                docker compose $(echo $compose_files | sed 's/ / -f /g' | sed 's/^/-f /') down
                ;;
            restart)
                echo "🔄 Redémarrage des fichiers compose: $compose_files..."
                docker compose $(echo $compose_files | sed 's/ / -f /g' | sed 's/^/-f /') down
                docker compose $(echo $compose_files | sed 's/ / -f /g' | sed 's/^/-f /') up -d --no-recreate
                ;;
            *)
                usage
                ;;
        esac
    else
        # Sinon, traiter comme un service individuel
        case "$action" in
            start)
                echo "🚀 Vérification du service: $target..."
                if ! docker ps --format "{{.Names}}" | grep -q "^$target$"; then
                    echo "🚀 Démarrage du service: $target..."
                    docker start "$target"
                else
                    echo "✅ Le service $target est déjà en cours d'exécution."
                fi
                ;;
            stop)
                echo "🛑 Arrêt du service: $target..."
                docker stop "$target"
                ;;
            restart)
                echo "🔄 Redémarrage du service: $target..."
                docker restart "$target"
                ;;
            *)
                usage
                ;;
        esac
    fi
}

# Supprimer les volumes
delete_volumes() {
    local target="$1"
    if [ "$target" == "all" ]; then
        echo "⚠️ Suppression de tous les volumes Docker..."
        docker volume prune -f
    elif [[ -n "${COMPOSE_FILES[$target]}" ]]; then
        echo "⚠️ Suppression des volumes du fichier compose: ${COMPOSE_FILES[$target]}..."
        docker compose -f ${COMPOSE_FILES[$target]} down -v
    else
        echo "⚠️ Suppression des volumes du service: $target..."
        docker rm -v $(docker ps -a -q --filter "name=$target")
    fi
    echo "✅ Suppression terminée."
}

case "$1" in
    start|stop|restart)
        execute_action "$1" "$2"
        ;;

    status)
        echo "📊 État des services en cours d'exécution..."
        docker ps --format "table {{.ID}}\t{{.Names}}\t{{.Status}}\t{{.Ports}}"
        ;;

    logs)
        if [ -z "$2" ]; then
            usage
        fi
        echo "📜 Affichage des logs pour le service: $2..."
        docker logs -f "$2"
        ;;

    prune)
        echo "⚠️ Suppression des conteneurs et volumes inutilisés..."
        docker system prune -a -f --volumes
        echo "✅ Nettoyage terminé."
        ;;

    list)
        echo "📂 Fichiers Docker Compose disponibles :"
        for key in "${!COMPOSE_FILES[@]}"; do
            echo "  - $key : ${COMPOSE_FILES[$key]}"
        done
        ;;

    rm)
        if [ -z "$2" ]; then
            usage
        fi
        delete_volumes "$2"
        ;;

    help)
        usage
        ;;

    *)
        usage
        ;;
esac
