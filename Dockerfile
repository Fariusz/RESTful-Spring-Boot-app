FROM openjdk:12-alpine

COPY build/libs/demo-*.jar /demo.jar

CMD ["java" , "-jar", "/demo.jar"]