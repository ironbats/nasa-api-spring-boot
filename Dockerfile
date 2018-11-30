FROM maven:3.3-jdk-8 as build
USER root
MAINTAINER Felipe Rodrigues  <felipe.themarkiron@gmail.com>
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package
RUN mv /tmp/target/AddtechNeas-0.0.1-SNAPSHOT.jar  /opt
