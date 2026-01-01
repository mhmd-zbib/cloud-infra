FROM eclipse-temurin:21-jre AS run
WORKDIR /app
COPY *.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
