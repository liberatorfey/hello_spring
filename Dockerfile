FROM openjdk:18-jdk-alpine
EXPOSE 9898
ADD ./target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]