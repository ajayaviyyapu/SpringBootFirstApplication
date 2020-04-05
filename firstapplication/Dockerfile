#The Image to be pulled from Docker Hub
FROM openjdk:8
#Which jar needs to be picked up and provided to docker 
#Currently we are providing the jar in the root location of Docker
ADD target/docker-spring-boot.jar docker-spring-boot.jar
#Port on which the application needs to run. 
#Please note that the serve.port number in the application properties file and this port number should match 
EXPOSE 8090
#Arguments that needs to be passed to Docker to run the application
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"] 