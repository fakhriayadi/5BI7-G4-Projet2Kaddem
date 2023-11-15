# Use the official OpenJDK base image
FROM openjdk:8-jdk-alpine

# Add your JAR file from the local filesystem to the image
ADD target/kaddem-1.0.jar app.jar

# Expose the port your application will run on
EXPOSE 8089

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
#RUN curl -o kaddem-1.0.jar -L "http://192.168.1.10:8081/repository/maven-releases/tn/esprit/spring/gestion-station-ski/1.0/gestion-station-ski-1.0.jar"