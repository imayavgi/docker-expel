FROM openjdk:8-jre
WORKDIR /app
COPY target/consumer-app-0.0.1-SNAPSHOT.jar consumer-app-0.0.1-SNAPSHOT.jar
CMD ["/usr/bin/java", "-Dspring.profiles.active=docker", "-jar", "/app/consumer-app-0.0.1-SNAPSHOT.jar"]
