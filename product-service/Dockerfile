FROM alpine-jdk:base
MAINTAINER mukhtiar
COPY target/product-service-1.0.jar /opt/lib/
ENTRYPOINT exec /usr/bin/java $JAVA_OPTS  -jar  /opt/lib/product-service-1.0.jar
EXPOSE 8000