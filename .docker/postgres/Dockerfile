FROM postgres:latest

ENV POSTGRES_DB=adventureworks
ENV POSTGRES_USER=admin
ENV POSTGRES_PASSWORD=admin

# Copie des fichiers de données et du script SQL dans le conteneur
COPY ./.docker/postgres/adventureworks/data/ /docker-entrypoint-initdb.d/data

# Assurez-vous que le fichier install.sql est exécutable
# RUN chmod +x /docker-entrypoint-initdb.d/install.sql
