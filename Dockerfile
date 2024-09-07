FROM gradle:7.6-jdk17 AS build

WORKDIR /app

COPY build.gradle settings.gradle /app/

COPY gradle /app/gradle

RUN gradle dependencies --no-daemon

COPY src /app/src

RUN gradle build --no-daemon

FROM openjdk:17-jdk-slim

WORKDIR /app

EXPOSE 8081

COPY --from=build /app/build/libs/admin-escola-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
