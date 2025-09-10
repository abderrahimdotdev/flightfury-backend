FROM eclipse-temurin:21-alpine
LABEL authors="abderrahim"

RUN useradd flightfury -s $(which sh)

USER flightfury

WORKDIR /app

COPY target/flightfury-aircrafts-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["./mvnw", "spring-boot:run","flightfury-aircrafts-0.0.1-SNAPSHOT.jar"]