FROM store/oracle/serverjre:8
ADD target/demo-1.jar demo-1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-1.jar"]
