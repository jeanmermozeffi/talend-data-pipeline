#    spark-master:
#        build:
#            context: .
#            dockerfile: .docker/spark/Dockerfile
#        image: cic-apache-spark:${SPARK_VERSION}
#        container_name: spark-master
#        ports:
#          - "9090:8080"
#          - "7077:7077"
#        volumes:
#           - ./src/pyspark:/opt/spark-apps
#           - ./spark_data:/opt/spark-data
#           - spark-logs:/opt/spark/spark-events
#        environment:
#          - SPARK_LOCAL_IP=spark-master
#          - SPARK_WORKLOAD=master
#          - SPARK_MASTER=spark://spark-master:7077
#          - JUPYTER_ENABLE_LAB=yes

#    spark-history-server:
#        container_name: spark-history
#        image: cic-apache-spark:${SPARK_VERSION}
#        entrypoint: [ '/start-spark.sh', 'history' ]
#        depends_on:
#            - spark-master
#        env_file:
#            - .env
#        volumes:
#            - spark-logs:/opt/spark/spark-events
#        ports:
#            - '18080:18080'

#    spark-worker-1:
#        image: cic-apache-spark:${SPARK_VERSION}
#        container_name: spark-worker-1
#        ports:
#          - "9091:8080"
#          - "7000:7000"
#        depends_on:
#          - spark-master
#        environment:
#          - SPARK_MASTER=spark://spark-master:7077
#          - SPARK_MODE=worker
#          - SPARK_WORKER_CORES=1
#          - SPARK_WORKER_MEMORY=1G
#          - SPARK_DRIVER_MEMORY=1G
#          - SPARK_EXECUTOR_MEMORY=1G
#          - SPARK_WORKLOAD=worker
#          - SPARK_LOCAL_IP=spark-worker-1
#        volumes:
#           - ./src/pyspark:/opt/spark-apps
#           - ./spark_data:/opt/spark-data
#           - spark-logs:/opt/spark/spark-events
#
#    spark-worker-2:
#        image: cic-apache-spark:${SPARK_VERSION}
#        container_name: spark-worker-2
#        ports:
#          - "9092:8080"
#          - "7001:7000"
#        depends_on:
#          - spark-master
#        environment:
#          - SPARK_MASTER=spark://spark-master:7077
#          - SPARK_MODE=worker
#          - SPARK_WORKER_CORES=1
#          - SPARK_WORKER_MEMORY=1G
#          - SPARK_DRIVER_MEMORY=1G
#          - SPARK_EXECUTOR_MEMORY=1G
#          - SPARK_WORKLOAD=worker
#          - SPARK_LOCAL_IP=spark-worker-2
#        volumes:
#            - ./src/pyspark:/opt/spark-apps
#            - ./spark_data:/opt/spark-data
#            - spark-logs:/opt/spark/spark-events
#
#    jupyter:
#        image: jupyter/pyspark-notebook:latest
#        container_name: spark-jupyter
#        ports:
#            - "8888:8888"
#        depends_on:
#            - spark-master
#        environment:
#            - PYSPARK_PYTHON=/usr/bin/python3
#            - PYSPARK_DRIVER_PYTHON=jupyter
#            - PYSPARK_DRIVER_PYTHON_OPTS=notebook
#            - SPARK_VERSION=3.5.4
#            - SPARK_HOME=/usr/local/spark
#            - SPARK_MASTER=spark://spark-master:7077
#            - JUPYTER_ENABLE_LAB=yes
#        volumes:
#            - ./src/notebooks:/home/jovyan/work:rw

#    minio:
#        image: minio/minio
#        container_name: airflow_minio
#        restart: always
#        command: server /data --console-address ":9001"
#        environment:
#            MINIO_ROOT_USER: admin
#            MINIO_ROOT_PASSWORD: admin123
#        ports:
#            - "9000:9000"
#            - "9001:9001"
#        volumes:
#            - minio_data:/data
#
#    minio-create-bucket:
#        image: minio/mc
#        depends_on:
#            - minio
#        entrypoint: >
#            /bin/sh -c "
#            sleep 5;
#            mc alias set myminio http://minio:9000 admin admin123;
#            mc mb myminio/airflow-logs;
#            exit 0;
#            "
#
