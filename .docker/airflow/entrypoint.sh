#!/bin/bash

echo "🔍 Vérification des scripts disponibles dans /entrypoint.d/"
ls -l /entrypoint.d/

# Rendre tous les scripts exécutables
chmod +x /entrypoint.d/*.sh

# Exécuter chaque script dans l'ordre
for script in /entrypoint.d/*; do
    if [ -f "$script" ]; then
        echo "Exécution de $script ..."
        bash "$script"
    fi
done

echo "✅ Tous les scripts ont été exécutés !"
