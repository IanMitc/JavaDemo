# Microsercices

1. create department service
2. create user service
3. making http call from user to department service using restTemplate
4. create service-registry serice using eureka
 

pom.xml

	<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>


application.yml

server:
  port: 8761

eureka:
  client:
    register-with-eureka: false
    fetch-registry: false


5. add eureka client dependency into department service

pom.xml

	<properties>
		<java.version>11</java.version>
		<spring-cloud.version>2021.0.0</spring-cloud.version>
	</properties>

	<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>



application.yml

server:
  port: 9001

spring:
  application:
    name: DEPARTMENT-SERVICE

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eurke
    register-with-eureka: true
    fetch-registry: true
  instance:
    hostname: localhost

6. 5. add eureka client dependency into userservice

pom.xml

	<properties>
		<java.version>11</java.version>
		<spring-cloud.version>2021.0.0</spring-cloud.version>
	</properties>

	<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>



application.yml

server:
  port: 9001

spring:
  application:
    name: DEPARTMENT-SERVICE

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eurke
    register-with-eureka: true
    fetch-registry: true
  instance:
    hostname: localhost