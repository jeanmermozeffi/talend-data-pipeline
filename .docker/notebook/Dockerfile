# Utiliser une image Jupyter Notebook comme base
FROM jupyter/pyspark-notebook:latest

# Passer en mode root pour installer Python 3.11.11
USER root

# Installer les dépendances pour Python 3.11.11
RUN apt-get update && apt-get install -y software-properties-common \
    && add-apt-repository ppa:deadsnakes/ppa \
    && apt-get update && apt-get install -y \
    python3.11 python3.11-distutils python3.11-dev python3.11-venv \
    && rm -rf /var/lib/apt/lists/*

# Configuration de Python 3.11 comme version par défaut
RUN update-alternatives --install /usr/bin/python3 python3 /usr/bin/python3.11 1 \
    && update-alternatives --set python3 /usr/bin/python3.11

# Vérifier que Python 3.11 est bien utilisé
RUN python3 --version

# Installer pip pour Python 3.11.11
RUN curl -sS https://bootstrap.pypa.io/get-pip.py | python3.11

# Installer les dépendances essentielles
RUN pip install --no-cache-dir --upgrade pip \
    && pip install --no-cache-dir \
    pyspark==3.5.4 \
    ipykernel \
    jupyterlab \
    numpy pandas matplotlib seaborn scikit-learn

# Revenir en mode utilisateur Jupyter
USER ${NB_UID}
