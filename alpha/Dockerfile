ARG SERVICE
FROM eclipse-temurin:21-jdk AS build
WORKDIR /build
COPY . .
RUN ./mvnw -B -pl $SERVICE -am clean package --no-transfer-progress

FROM eclipse-temurin:21-jre AS run
WORKDIR /app
ARG SERVICE
COPY --from=build /build/$SERVICE/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
