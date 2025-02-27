#!/bin/bash

# Installer PySpark si ce n'est pas déjà fait
pip show pyspark > /dev/null 2>&1
if [ $? -ne 0 ]; then
    echo "⚡ Installing PySpark 3.5.4..."
    pip install pyspark==3.5.4 --no-cache-dir
else
    echo "✅ PySpark is already installed."
fi

# Démarrer Jupyter Notebook
exec start-notebook.sh "$@"
