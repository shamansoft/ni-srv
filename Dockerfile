FROM openjdk:14-alpine
COPY build/libs/ni-srv-*-all.jar ni-srv.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "ni-srv.jar"]