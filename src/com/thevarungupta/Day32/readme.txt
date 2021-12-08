# MVC
M - Model
V - View
C - Controller

Spring MVC is a java framework that is used to build web application. 
It follows the Model-View-Controller design pattern
It implements all the basic feature of the core spring framework like IOC, DI etc


Model - A model contains the data of the application. Data can be a single object or a collection of objects
View - represent the provided information in a particular format. mainly we will use JSP  to create view pages
Controller - it contains the business logic of the application, here the @Controller annotaion is used to mark the class
 as the controller
Front Controller - In spring MVC, the dispatchServlet class work as the front controller. it is responsable the flow of the
 spring MVC application


# What is Spring MVC?
- A spring MVC is a sub framework of the spring framework which is used to build web application
- It is build on the top of servlet API 
- It follow the model-view-controller design patern


# Why Spring MVC?
- seprate each role in model, view and controller
- powerfull configuration
- rapid application development
- it is a sub framework of spring which use spring core like IOC etc
- spring MVC is flexible, easy to test and much more features


# Get started with MVC

# What is front controller class of spring MVC?
A front controller is define as a controller that handles all request for a web application
DispatchServlet servlet is the fronyt controller in Spring MVC that inptercepts every request and the dispatches 
request to an appropriate controller
when a web request us sent to a spring MVC application, dispatcher servlet first receives the request
then it organize the different components configuared in spring web app contexyt


1. create maven project by choosing webapp from the template

2. add spring MVC dependency in pom.xml


3. configure the dispatch Servlet in the web.xml
  create a file by name spring-servlet.xml

4. configure ViewResolver

5. create controller

6. create a view to show page







