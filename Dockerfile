# Use a base image with Java
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/tictactoe-1.0.0.jar /app/tictactoe-1.0.0.jar

# Expose the port on which the microservice listens
EXPOSE 8080

# Define the command to run the microservice when the container starts
CMD ["java", "-jar", "tictactoe-1.0.0.jar"]
