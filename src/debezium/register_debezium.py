import os
import requests
import json

# Charger la configuration depuis un fichier JSON
BASE_DIR = os.path.dirname(os.path.abspath(__file__))
CONFIG_FILE = os.path.join(BASE_DIR, "debezium_config.json")

def load_connector_config():
    """Charge la configuration du connecteur depuis un fichier JSON"""
    try:
        with open(CONFIG_FILE, "r") as file:
            return json.load(file)
    except Exception as e:
        print(f"[❌] Erreur lors du chargement de la configuration : {e}")
        exit(1)

# URL de Kafka Connect
KAFKA_CONNECT_URL = "http://localhost:8083/connectors"
CONNECTOR_NAME = "debezium-postgres-connector"

def register_connector(config):
    """Envoie une requête pour enregistrer le connecteur dans Kafka Connect"""
    headers = {"Content-Type": "application/json"}

    # Vérifier d'abord si le connecteur existe déjà
    response_check = requests.get(f"{KAFKA_CONNECT_URL}/{CONNECTOR_NAME}")

    if response_check.status_code == 200:
        print("[⚠️] Le connecteur existe déjà.")
        return

    response = requests.post(KAFKA_CONNECT_URL, headers=headers, data=json.dumps(config))

    if response.status_code == 201:
        print("[✅] Connecteur Debezium créé avec succès !")
    elif response.status_code == 409:
        print("[⚠️] Le connecteur existe déjà.")
    else:
        print(f"[❌] Erreur lors de la création du connecteur : {response.status_code} - {response.text}")

def check_connector_status():
    """Vérifie le statut du connecteur"""
    try:
        response = requests.get(f"{KAFKA_CONNECT_URL}/{CONNECTOR_NAME}/status")

        if response.status_code == 200:
            status = response.json()
            print(f"[ℹ️] État du connecteur : {status['connector']['state']}")
            print(f"[ℹ️] Détails des tâches : {status['tasks']}")
        else:
            print(f"[❌] Impossible de récupérer le statut du connecteur. Code : {response.status_code}")
            print(f"[🔍] Réponse : {response.text}")

    except requests.exceptions.RequestException as e:
        print(f"[❌] Erreur lors de la requête vers Kafka Connect : {e}")

if __name__ == "__main__":
    connector_config = load_connector_config()
    register_connector(connector_config)
    check_connector_status()
