FROM openjdk:17
EXPOSE 8080
ADD target/simple-docker-app.jar simple-docker-app.jar
ENTRYPOINT ["java", "-jar", "/simple-docker-app.jar"]