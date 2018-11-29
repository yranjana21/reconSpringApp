# Start with a base image containing Java runtime
FROM java:8

# Add a volume pointing to /tmp
VOLUME /tmp

# Add the application's jar to the containers 
ADD target/Users-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]