# Autowiring in spring

It is a feature of the spring framework that enables you to inject the object dependency implicity
it internally uses setter or constructor injection

Autowiring can't be used to inject primitive and string value
it work with reference type only

# Advantages
- it require less code because we dont have to write the code to inject the dependencies explicitly

# Disadvantage
- no control for the programmer
- it can't be used got primitive and string values

A----->B

# there are many auto wiring mode
- no : it is default autowiring mode, which means no autowiring by default
- byName : in this mode inject the object dependency according to the name of the bean, in this case property name and bean name
  must be same and it internally call the setter method
- byType : in this mode inject the object depedency according to type, and in this case property name and bean name can be different
  it internally call the setter method
- constructor : the constructor mode inject the dependency by calling the constructor of the class
- autodetect : it has been deprecated since spring 3

# Autowiring can be done in two ways
1. using xml
2. using annotation (@Autowired)

# Spring framework provides various type of annotations
these annotations are used to create spring bean automatically on the application context

there are some stereotype meta-annotation which is derived from @Component
spring will automatically import the bean into the container and inject them into depedencies 


#Component annotation
it make a java class as a bean so the component-scanning mechanism of spring can pick it up and pull it into application to use
this annotation we have apply it over class


# Bean Scope
It means to the lifecycle of the bean that means when the object of bean will be instantiated
how long does that objet live
how many object will be createdf for the bean througout
it controls the instance creation of the bean and it is managed by the spring container

the spring framework provides five scope for a bean
we can use three of them only in the context of web aware springApplicationContext and test of the two is available for both
IOC container and spring MVC container

1. Singleton - only one instance will be created for a single bean definition per spring IOC container (default)
2. Prototype - a new instance will be created for a single bean definition every time a request is made
3. Request - a new instance will be created for a single bean definition every time an http request is made
4. session - scope a single bean definition to the lifecycle of the http session
5. Global-Session - scope a single bean dfinition to the lifecycle of the global http session



# Spring with ORM Framework
Spring provides API to easily integrate Spring with ORM framework such as Hibernmate, JPA, JDO etc

Advatanges
- less coding is required - by the help of spring framework, yuou domt need to write extra code before and after the actual database
  logic such as getting the connection, starting transaction, commiting transaction, closing connection
- East to test - Spring IOC approach makes it east to test the app
- Better exception handling - spring framework provides its own API for exception handlking with ORM framework
- integrated transaction manageemnt: by the help of spring framework we can wrap our mapping code with the explicit template wrapper
class


HibernateTemplate 
the spring framework provides HibernateTemplate class, so you dont need to follow so many steps like create Configuration, 


Exercise: Hibertate and Spring integration
1. create table in database
2. create applicationConfig file
3. Create employee pojo class
4. create .xml file 
5. employeeDao file
6. insert into database




