FROM ubuntu

RUN apt-get update
RUN apt-get install -y openjdk-11-jdk

ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]