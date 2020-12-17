# Ni Server

Microservice web app to serve Ni clients

## Development
Run: 
```
./gradlew run
```
(Re)Build
```
./gradlew clean build
```
Build docker image with tag ni-srv:0.0.1 locally
```
docker build . --tag ni-srv:0.0.1
```
Run docker image on port 8082
```
docker run -d -p 8082:8080 ni-srv:0.0.1
```
Healthcheck
```
http://localhost:8082/health
```
should return `OK`