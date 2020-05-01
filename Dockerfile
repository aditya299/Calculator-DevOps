# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
COPY target/calculator-1.0-SNAPSHOT.jar /calc.jar 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/calc.jar"]
