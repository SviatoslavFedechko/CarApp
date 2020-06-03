FROM store/oracle/serverjre:8
ADD target/demo-1.jar demo-1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-1.jar"]

#FROM jenkins:latest
#LABEL maintainer=”sv.fedechko@gmail.com”
#
#ENV JAVA_OPTS="-Xmx8192m"
#ENV JENKINS_OPTS=" --handlerCountMax=300"




