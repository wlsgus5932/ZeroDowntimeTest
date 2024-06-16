FROM openjdk:17-alpine
ARG PROFILES
ARG ENV
WORKDIR /app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "-jar", "app.jar"]