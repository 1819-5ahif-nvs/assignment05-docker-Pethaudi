# 1819_5ahif_nvs_assignment05_docker
Dockerfile, docker.compose.yml for JakartaEE, mariadb, reverse proxy, ...

# Übung

- Dockerfile
- docker-compose

Termin: 30.November 2018

## Erstellen Dockerfile

Verwenden Sie Ihr microprofile-Projekt (eigene DB-Tabellen)

Schreiben Sie ein Dockerfile, um ausgehend von einer vanilla Ubuntu-Installation, installieren Sie Java 10.0 (bei Problemen 8). Anschließend ist noch das 

Als Ergebnis soll auch ein kleines Cheat-Sheet erstellt, werden in dem zB Unterschied zwischen ADD und COPY erklärt. Warum COMMAND/EXECUTE wichtig ist.

<https://github.com/caberger/jee-docker>

## Container-Orchestrierung mit docker-compose

Erstellen Sie ein docker-compose.yml File
Diskutieren Sie Probleme, wie das Warten auf die Datenbank


## Upload in dockerhub

Laden Sie Ihr Arbeitsergbnis in Dockerhub hoch und geben SIe die Koordinaten im README an

# Notizen
Das hinzufügen eines zusätzlichen apt Repository zum installieren von jdk10 ist nicht gelungen, darum wird jdk1.8 verwendet.