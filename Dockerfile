# Use an official Java runtime as a parent image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the built .jar file into the container
COPY target/todo-app.war todo-app.war


# Expose port 8080 for the application
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "todo-app.jar"]
