FROM maven:3.6.3-jdk-11 AS MAVEN_TOOL_CHAIN
WORKDIR /tmp
COPY pom.xml /tmp
COPY . .
RUN mvn package


# Dockerfile
FROM adoptopenjdk/openjdk11:jdk-11.0.10_9-alpine
COPY --from=MAVEN_TOOL_CHAIN tmp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
