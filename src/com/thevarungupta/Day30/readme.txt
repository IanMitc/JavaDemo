# What is Spring Framework?
- Spring is a lightweight framework
- it can be also though of as a framework of framework bcoz it provides support to various frameworks such as struts, 
hibernate, EJB etc
- the framework in a broader sense can be defines as a structure where we can find the solution of the various technical problem

- spring framework comprises of sevral modules such as
- IOC
- AOP
- DAO
- Context
- ORM
- Web MVC etc

# Advantages of Spring Framework
- Predefine template - spring framework provides template for JDBC, Hibernate, JPA etc
- Loosly coupling - the spring applicationm are loosly couple because of dependency injection
- easy to test
- lightweight - it is lightweight because og its POJO implementation
- fast development
- powerfull abstraction
- declarative support


# Spring Modules
- Test
- Spring Core Container
- Data Access / Integration
- Web


# IOC Container
The IOC container is responsable for instantiating, configure and assemble the object
The IOC container get information from the XML file and work accordingly
the main tasks perform by IOC are
1. to instantiate the application class
2. to configure the object
3. to asemble the dependency between the object


# There are two type of IOC containers
1. BeanFactory
2. ApplicationContext



# BeanFactory and applicationContext interface act as the IOC container
the application interface is buld on top of BeanFactory interface
It add some extra feature or functionality then BeanFactory
such as simple integration with spring AOP, message resources etc
so it is better to use AppliocationContext then BeanFactory


# Dependency Injection in Spring
DI is a design pattern that removes the dependency from the programming code so that it can be easy to manage and
test the application
DI makes our programming code lossly coupled

there are mainly two problem of dependency lookup
1. tight coupling the dependency lookup approach make the code tightly coupled, if resources are changed we need to perform a lot of 
modification in the code
2. not easy for testing - this approach create a lot of problem while testing the application, easpcially in unit testing


# Spring framework provides two way to injecting dependencies
- by constructor
- by setter method

# Dependency injection by the constructor
we can inject the dependency by the constructor
the <constructor-arg> subelement of <bean> which is used for constructor injection
- primitive and string based value
- collection values
- dependent object



# Dependency injection by setter method
we can inject the dependency by setter mehod also
the <property> subelement of <bean> which is used for setter injection
here we can inject
- primitive and string value
- dependent object
- collection value etc


D/W between constructor and Setter injection
1. Partial dependency - can be injected using setter injection , but it is not possible by constructor injection
2. Overriding  - setter injection override the constructor injection if we use both IOC will use setter
3. Change - we can easily change the value by setter injection, so setter injection is more flexible then the constructor injection


# Exercise 1: create maven project, ceate config file, setter injection, spring core

Step 1: Use your Fav. ID (IDEA / eclipse)
Step 2: create a maven project

Maven -> quick start template

Step 3: add dependencies -> spring core, spring context

 <dependencies>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>5.3.13</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.13</version>
    </dependency>

pom.xml

Step 4. create a POJO class

main / java / com.example / Student

package com.revature;

public class Student {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

Step 5. create a config file

resources / config.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean class="com.revature.Student" name="student1" >
        <property name="studentId">
            <value>101</value>
        </property>
        <property name="studentName">
            <value>Mark</value>
        </property>
        <property name="studentEmail">
            <value>m@gmail.com</value>
        </property>
    </bean>
</beans>

Step 6. setter injection


Step 7. main class -> we can get the bean form the IOC and use it

ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student1");
        System.out.println(student);

Step 8: run the application and chek the output in the console


Exercise 2: Property injection using value as attribute or using p schema


 <bean class="com.revature.Student" name="student2">
        <property name="studentId" value="201"/>
        <property name="studentName" value="Paul"/>
        <property name="studentEmail" value="p@gmail.com"/>
    </bean>

    <bean class="com.revature.Student" name="student3" p:studentId="301" p:studentName="Watson" p:studentEmail="w@gmail.com"/>


Exercise 3: How to inject collection type (list, set, map etc)
<bean class="com.revature.Employee" name="employee1">
        <property name="name" value="mark"/>
        <property name="phones">
            <list>
                <value>9999</value>
                <value>8888</value>
                <value>7777</value>
            </list>
        </property>
        <property name="address">
            <set>
                <value>India</value>
                <value>USA</value>
                <value>UK</value>
            </set>
        </property>
        <property name="departments">
            <map>
                <entry key="admin" value="USA"/>
                <entry key="sales" value="UK"/>
                <entry key="IT" value="Japan" />
            </map>
        </property>
    </bean>




Exericise 4: setter injection with ref type
<bean class="com.revature.Address" name="address1">
        <property name="city" value="NY"/>
        <property name="country" value="USA"/>
    </bean>

    <bean class="com.revature.Customer" name="customer1">
        <property name="custId" value="101"/>
        <property name="name" value="Paul"/>
        <property name="address" ref="address1"/>
    </bean>


Exercise 5: Constructor injection


Exercise 6: Ambiguity problem with constructorm injection
when we have multiple constructor which take different type of parametere








