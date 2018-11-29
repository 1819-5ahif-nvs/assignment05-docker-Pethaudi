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
Das Hinzufügen eines zusätzlichen apt Repository zum installieren von jdk10 ist nicht gelungen, darum wird jdk1.8 verwendet.

Die vorgegebene docker-compose.yml ist zu lange und wurde abgespeckt auf das nötigste.

## docker-compose.yml
```
services: // sammelt alle benötigten services
  wildfly:
    build: wildfly 	// der Ordner in dem das dockerfile gebuildet wird
    ports: 		// freigegebene Ports
      - 8080:8080	// Rest
      - 9990:9990	// Managerconsole
    depends_on: 	// wildfly wird erst nach mysql gestartet
      - mysql
    environment:
      - MYSQL_ROOT_PASSWORD=root // setzen einer environment Variable
```

## ADD vs COPY
Add erlaubt auch URLs, allerdings ist es best-practise copy wann immer es möglich ist zu benutzen, da sein Verhalten vorhersehbarer ist (nicht, dass plötzlich irgendetwas fremdes kopiert wird)

## RUN vs CMD vs ENTRYPOINT
http://goinbigdata.com/docker-run-vs-cmd-vs-entrypoint/