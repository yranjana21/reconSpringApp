#Use an official Python runtime as a parent image
FROM java:8

# Set the working directory to /app
WORKDIR /target

# Copy the current directory contents into the container at /app
COPY . /target

# Install any needed packages specified in requirements.txt
#RUN java -jar Users-0.0.1-SNAPSHOT.jar &

# Make port 80 available to the world outside this container
EXPOSE 8000

# Define environment variable
#ENV NAME World

# Run app.py when the container launches
CMD ["java", "-jar", "/target/Users-0.0.1-SNAPSHOT.jar --server.port=8000"]


