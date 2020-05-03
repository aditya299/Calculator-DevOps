# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
RUN cd /var/lib/jenkins/workspace/Calculator_Build/target
# copy WAR into image
COPY /var/lib/jenkins/workspace/Calculator_Build/target/calculator-1.0-SNAPSHOT.jar /calc.jar 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/calc.jar"]
