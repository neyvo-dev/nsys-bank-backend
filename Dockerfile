FROM eclipse-temurin:17-jdk-jammy
VOLUME /tmp
COPY target/nsysbank-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]