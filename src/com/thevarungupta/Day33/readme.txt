# Spring Boot?
- Spring bood is a spring module that provides Rapid Development feature to the Spring Framework
- Spring Boot makes it easy to create stand alone, production ready spring based application that you can JUST Run
- it provides an easier and faster way to setup configuration and run both simple and web based application

Spring framework + Embedded Server - Configuration = Spring Boot

convention over configuration software design style
it decreses the effort of the developer
automatic configuration


# Advantages
- It create a stand alone spring app that can be started using java .jar file
- it tests web application easily with the help of different embedded HTTP server such as tomcat, jetty etc
- it provide opinanated starter POM to simplify our Maven configuration
- automatically configure spring and 3rd party libraries whenever possible
- provide production ready features such as metrics, health check and externalize configuration
- absolutely no code feneration and no requirement for XML configuration
- it also offer a CLI tool for developing and testing spring boot application
- it provide various plugins
- it also minimize writing multiple biolderplate code, xml configuration and annotations
- it increase productivity and reduce development time


# Spring boot framework have many other sub project which help to build application that address the modern business needs
- Spring Data
- Spring Batch
- Spring Seurity
- Spring Integration
- Spring Cloud


# Disadvantages / Limitation
Spring Boot can use dependencies that are not going to be used in the application
these depedencies increase the size of the application


# Spring Boot Features
- Web Application
- REST full API
- Security
- Logging
- Propeties
- External Configuration


#  How to create project in spring boot
1. create a maven project and add starter depedencies
2. using spring initilizer (recommand)    -   https://start.spring.io/
3. Use IDE like STS
4. spring boot command line interface


Spring Boot Annotation
It is a form of meta data that provides data about a program or annotation are use to provide supplement information
about the program

@Required - it is use to mention any property of the bean is manadatory
@Autowire - it is ysed to auto-wire spring bean on setter method, instance varable and constructor
            when we use @Autowire annotation the spring container auto-wire the bean by matching data-type
@Configuration - it is class level annotation the class annotation with @Configuration used by spring container as a 
                 source of bean definition
@ComponentScan - it is used when we want to scan a package for beans. it is used with annotation @Configuration 
                 we can also specify the base package to scan for spring component
@Bean - it is method level annotation it is an alternative for xml <bean> tag
@Controller - it is class level annotation it marks a class as a web rquest handler, it is mostly used with @RequestMapping
@Repository - to define a Dao that access the databse directly
@Service - it is also used at class levelit twll the spring that class contain the business logic
@Entity
@RestController
@Component



@EnableAutoConfiguration: it auto-configure the beans that is present in the class path
@SpringBotApplication - it is a combination of three annotation

@SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @Configuration


# Spring boot Architecture
spring boot follows a layerd architecture in which each communicate with other layers directly
theer are 4 layers which spring boot follow

- Presentation layer - authentication
- Buiness Later - buinsess logic
- Persistence Layer - storage layer
- Database Layer - actual database


# Exercises
- Create spring boot app
- change the port number
- start the spring app
- create a controller
- use request mapping for controller method
- DevTools
- Adding depedencies (H2 and JPA)
- Accessing h2-consle
- create component
- folder component
- testign api using REST cliennt (postman / fiddler / insomania)
- building complete REST API








