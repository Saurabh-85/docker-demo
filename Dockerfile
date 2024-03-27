# Start with the given base image for JDK * from Docker HUB
FROM openjdk:19
#Expose the given port outside of the container to access the appliation
EXPOSE 8888
# add jar for the spring boot project
ADD target/docker-demo-app.jar docker-demo-app.jar
ENTRYPOINT ["java","-jar","/docker-demo-app.jar"]