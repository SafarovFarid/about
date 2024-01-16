#FROM openjdk:25
#COPY target/about-api-0.0.1-SNAPSHOT.jar backend.jar
#
#ENTRYPOINT ["java","-jar", "backend.jar"]

FROM maven:3.8.4-openjdk-17 as builder
WORKDIR /app
COPY . /app/.
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true
ENTRYPOINT ["java","-jar", "backend.jar"]

