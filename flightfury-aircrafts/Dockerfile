FROM eclipse-temurin:21-jdk-alpine
LABEL authors="abderrahim"

RUN groupadd -r flightfury && useradd flightfury -s $(which bash)

WORKDIR /app

RUN chown -R /app flightfury:flightfury

USER flightfury

COPY ./ .

RUN ./mvnw clean package


FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/src/target/flightfury-aircrafts-0.0.1-SNAPSHOT.jar .

#ENTRYPOINT ["./mvnw", "spring-boot:run","flightfury-aircrafts-0.0.1-SNAPSHOT.jar"]