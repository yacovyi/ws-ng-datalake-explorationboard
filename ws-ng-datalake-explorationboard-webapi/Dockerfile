FROM openjdk:8-jdk-alpine
MAINTAINER Yacov Yitzhak <yacovyi@rnd-hub.com>

# Add the service itself
ARG JAR_FILE
COPY target/${JAR_FILE} /usr/share/myservice/myservice.jar

EXPOSE 8440
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]
