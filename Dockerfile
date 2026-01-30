# Java base image (stable & supported)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the project
RUN mvn clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/*.jar"]
