FROM alpine-jdk:base
MAINTAINER mukhtiar
COPY target/cloud-registry-1.0.jar /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/cloud-registry-1.0.jar"]
EXPOSE 8761