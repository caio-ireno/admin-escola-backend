FROM openjdk:17-jdk-slim AS build
RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

EXPOSE 8081

COPY --from=build /app/target/admin-escola-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
