FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/tictactoe.jar /app/tictactoe.jar

EXPOSE 8080

CMD ["java", "-jar", "tictactoe.jar"]
