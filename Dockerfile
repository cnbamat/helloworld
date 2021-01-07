FROM adoptopenjdk/openjdk11:alpine-slim
LABEL maintainer="chrisb"
RUN mkdir /opt/app
COPY target/*SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]