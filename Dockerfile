FROM gradle:7.6-jdk17 AS build

WORKDIR /app

COPY build.gradle settings.gradle /app/

COPY gradle /app/gradle

RUN gradle dependencies --no-daemon

COPY src /app/src

RUN gradle clean build --no-daemon --info

FROM openjdk:17-jdk-slim

WORKDIR /app
COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.config.name=application-render"]
