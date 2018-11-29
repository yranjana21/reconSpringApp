FROM java:8
COPY ./target/Users-0.0.1-SNAPSHOT.jar
WORKDIR /target
EXPOSE 8000
CMD ["java", "-jar", "Users-0.0.1-SNAPSHOT.jar"]