FROM openjdk:21-jdk
WORKDIR /app
COPY target/primaApp-0.0.1-SNAPSHOT.jar /app/demo.jar
EXPOSE 8081
CMD ["java", "-jar", "demo.jar"]
