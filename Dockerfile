FROM eclipse-temurin:17-jdk-jammy

WORKDIR /ideax-service

COPY target/*.jar app.jar

EXPOSE 8443

ENTRYPOINT ["java","-jar","app.jar"]