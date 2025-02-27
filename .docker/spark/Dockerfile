## builder step used to download and configure spark environment
##FROM openjdk:11.0.11-jre-slim-buster as builder
#
## Utilisation de Python 3.10 basé sur Debian Bullseye
#FROM python:3.11-bullseye as builder
#
## Installer les dépendances système et Java
## Mise à jour des dépôts et installation des paquets
#RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
#    sudo \
#    curl \
#    vim \
#    unzip \
#    rsync \
#    openjdk-11-jdk \
#    build-essential \
#    software-properties-common \
#    ssh \
#    && apt-get clean && rm -rf /var/lib/apt/lists/
#
## Note: this is needed when you use Python 3.3 or greater
#ENV SPARK_VERSION=3.5.4 \
#    HADOOP_VERSION=3.3.6 \
#    SPARK_HOME=${SPARK_HOME:-"/opt/spark"} \
#    HADOOP_HOME=${HADOOP_HOME:-"/opt/hadoop"} \
#    PYTHONHASHSEED=1
#
## Download and uncompress spark from the apache archive
#RUN wget --no-verbose -O apache-spark.tgz "https://archive.apache.org/dist/spark/spark-${SPARK_VERSION}/spark-${SPARK_VERSION}-bin-hadoop${HADOOP_VERSION}.tgz" \
#    && mkdir -p /opt/spark \
#    && tar -xf apache-spark.tgz -C /opt/spark --strip-components=1 \
#    && rm apache-spark.tgz
#
#
## Apache spark environment
#FROM builder as apache-spark
#
#RUN mkdir -p ${HADOOP_HOME} && mkdir -p ${SPARK_HOME}
#WORKDIR ${SPARK_HOME}
#
## Install python deps
#COPY /requirements.txt .
#RUN pip3 install -r requirements.txt
#
#ENV SPARK_MASTER_PORT=7077 \
#    PATH="/opt/spark/sbin:/opt/spark/bin:${PATH}" \
#    SPARK_HOME="/opt/spark" \
#    SPARK_MASTER="spark://spark-master:7077" \
#    SPARK_MASTER_HOST="spark-master" \
#    PYSPARK_PYTHON="python3" \
#    SPARK_MASTER_WEBUI_PORT=8080 \
#    SPARK_LOG_DIR="/opt/spark/logs" \
#    SPARK_MASTER_LOG="/opt/spark/logs/spark-master.out" \
#    SPARK_WORKER_LOG="/opt/spark/logs/spark-worker.out" \
#    SPARK_WORKER_WEBUI_PORT=8080 \
#    SPARK_WORKER_PORT=7000 \
#    SPARK_WORKLOAD="master"
#
#
#EXPOSE 8080 7077 6066
#
#RUN mkdir -p $SPARK_LOG_DIR && \
#    touch $SPARK_MASTER_LOG && \
#    touch $SPARK_WORKER_LOG && \
#    ln -sf /dev/stdout $SPARK_MASTER_LOG && \
#    ln -sf /dev/stdout $SPARK_WORKER_LOG
#
#
#COPY /.docker/spark/conf/spark-defaults.conf "$SPARK_HOME/conf"
#
#RUN chmod u+x /opt/spark/sbin/* && \
#    chmod u+x /opt/spark/bin/*
#
#ENV PYTHONPATH=$SPARK_HOME/python/:$PYTHONPATH
#
#COPY /.docker/spark/start-spark.sh /
#RUN chmod +x /start-spark.sh
#
#CMD ["/bin/bash", "/start-spark.sh"]

ARG SPARK_STACK_VERSION
FROM apache/spark:3.5.4

USER root

# Installation de Python 3.11
RUN apt-get update && apt-get install -y software-properties-common
RUN add-apt-repository ppa:deadsnakes/ppa
RUN apt-get update && apt-get install -y \
    python3.11 \
    python3.11-distutils \
    python3.11-dev \
    python3-pip \
    && rm -rf /var/lib/apt/lists/*

# Création des liens symboliques
RUN update-alternatives --install /usr/bin/python3 python3 /usr/bin/python3.11 1 \
    && update-alternatives --set python3 /usr/bin/python3.11

# Vérifier que Python 3.11 est bien utilisé
RUN python3 --version

# Installation de pip pour Python 3.11
RUN curl -sS https://bootstrap.pypa.io/get-pip.py | python3.11

# Redéfinir ARG après FROM pour l'utiliser dans les commandes RUN
ARG SPARK_STACK_VERSION
# Installation des dépendances Python nécessaires
RUN pip3 install pyspark==${SPARK_STACK_VERSION}

USER 185