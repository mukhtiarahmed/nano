FROM alpine-jdk:base
MAINTAINER mukhtiar
COPY target/review-service-1.0.jar /opt/lib/
ENTRYPOINT exec /usr/bin/java $JAVA_OPTS  -jar  /opt/lib/review-service-1.0.jar
EXPOSE 9000