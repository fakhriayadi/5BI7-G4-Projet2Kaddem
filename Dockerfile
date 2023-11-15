FROM openjdk:11
EXPOSE 8089
ADD http://172.20.10.2:8081/repository/maven-releases/tn/esprit/spring/kaddem/1.0.2/kaddem-1.0.2.jar app.jar
CMD ["java", "-jar", "app.jar"]
