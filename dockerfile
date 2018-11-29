FROM ubuntu

ENV JAVA_HOME       /usr/lib/jvm/java-8-oracle

RUN apt-get update && \
  apt-get install -y openjdk-8-jre