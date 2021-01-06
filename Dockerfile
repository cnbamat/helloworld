FROM adoptopenjdk/openjdk11:ubuntu-jre
LABEL maintainer="chris"
RUN mkdir /opt/app
COPY target/helloworld.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]