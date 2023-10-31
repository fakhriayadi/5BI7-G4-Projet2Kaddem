# Utilisez une image OpenJDK avec la version 1.8.0_60
FROM openjdk:1.8.0_60-jre

# Copiez le contenu du répertoire "target" de votre projet à la racine du conteneur
ADD target/kaddem-SNAPSHOT-01.jar kaddem-SNAPSHOT-01.jar

# Exposez le port sur lequel votre application Java écoutera (utilisez un port disponible qui ne soit pas en conflit avec d'autres services)
EXPOSE 8088

# Définissez la commande d'entrée pour exécuter votre application Java (utilisez le nom du JAR correct)
ENTRYPOINT ["java", "-jar", "/kaddem-SNAPSHOT-01.jar"]