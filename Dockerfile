FROM openjdk:8
EXPOSE 8081
ADD target/webdocker-1-version1.jar webdocker.jar
ENTRYPOINT ["java","-jar","/webdocker.jar"]