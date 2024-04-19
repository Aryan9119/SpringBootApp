FROM openjdk:11
EXPOSE 8086
ADD target/BootDemoApp.jar BootDemoApp.jar
ENTRYPOINT ["java","-jar","/BootDemoApp.jar"]
