FROM openjdk:8-jdk-alpine
ADD target/AddtechNeas-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]