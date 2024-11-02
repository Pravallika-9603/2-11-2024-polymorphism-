FROM openjdk:17-jdk-alpine

COPY ./target/oops-1.0-SNAPSHOT.jar springdockerimg.jar

ENTRYPOINT ["java" ,"-jar","/springdockerimg.jar"]