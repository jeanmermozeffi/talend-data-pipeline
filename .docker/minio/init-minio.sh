#!/bin/sh

# Attendre que MinIO soit prêt
sleep 5

# Définir l'alias pour MinIO
mc alias set minio http://cic-minio:9000 admin Admin@123

# Créer les buckets nécessaires
mc mb minio/airflow-logs-bucket
mc mb minio/spark-bucket

# Définir les politiques des buckets (modifiable selon les besoins)
mc policy set public minio/airflow-logs-bucket
mc policy set public minio/spark-bucket

echo "🎉 MinIO Buckets Created Successfully!"
