# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
COPY calc.jar /calc.jar 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/calc.jar"]