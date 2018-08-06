FROM openjdk:8-jre
VOLUME springboot-volume
ARG JAR_FILE
COPY smart_speaker_docker-0.1.0.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=uat","-jar","/app.jar"]
