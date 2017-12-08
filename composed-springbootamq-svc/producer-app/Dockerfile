FROM openjdk:8-jre
WORKDIR /app
EXPOSE 8080
COPY target/producer-app-0.0.1-SNAPSHOT.jar producer-app-0.0.1-SNAPSHOT.jar
CMD ["/usr/bin/java", "-Dspring.profiles.active=docker", "-jar", "/app/producer-app-0.0.1-SNAPSHOT.jar"]
