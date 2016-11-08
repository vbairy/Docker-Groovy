FROM java:8
EXPOSE 8080
ADD /SpringDocker.war springdocker.war
ENTRYPOINT ["java", "-jar", "springdocker.war"]