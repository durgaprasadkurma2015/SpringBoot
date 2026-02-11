# Use OpenJDK 17
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven build files
COPY pom.xml .
COPY src ./src

# Build the project
RUN ./mvnw clean package -DskipTests

# Copy the built jar
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 1003

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]
