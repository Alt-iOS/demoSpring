# Start with a base image containing Java runtime and Maven
FROM maven:3.8.7-eclipse-temurin-19

# Set the current working directory in the image
WORKDIR /app

# Copy the pom.xml file to the working directory
COPY pom.xml .

# Download the dependencies as specified in pom.xml. This is done separately to leverage Docker cache and avoid downloading dependencies for every code change.
RUN mvn dependency:go-offline -B

# Copy the rest of the code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app/target/demoSpring-0.0.1-SNAPSHOT.jar"]