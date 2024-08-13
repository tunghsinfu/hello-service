FROM maven:3.8.3-openjdk-17 AS build
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN mvn clean package

FROM openjdk:17
RUN mkdir /app
COPY --from=build /project/target/hello-spring-api-0.0.1-SNAPSHOT.jar /app/hello-spring-api-0.0.1-SNAPSHOT.jar
WORKDIR /app
CMD java $JAVA_OPTS -jar hello-spring-api-0.0.1-SNAPSHOT.jar

# mac m1/m2 not support openjdk:17-jdk-alpine

# docker build -t <image_name> . `docker build -t hello-spring-api . `
# docker run -p 18080:8080 -t hello-spring-api
