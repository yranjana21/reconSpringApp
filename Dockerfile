FROM openjdk:8
VOLUME /target
ARG JAR_FILE
COPY ${JAR_FILE} Users-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Users-0.0.1-SNAPSHOT.jar"]