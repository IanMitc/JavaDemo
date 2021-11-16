# What is ORM?
Object Relational mapper
It is a technique that let you query and manipulate data from a database using object-oriented paradigm
When takinf about ORM, moist of the people are refreing to a library that implements the object relational mapping techniques


An ORM library is a completly oridinary library written in you language of choice that encapsulates the code
needed to manipulate the data so you dont use SQL anymore, you interact directky with an object in the
same language you are using

# Pros and conds
> using ORM save a lot of time beacuse
 - A lot of stuff is done automatically from database handling
 - you write your data model in one place and it is easier to update and reuse the code 
> Using an ORM library is more flexible
 - it fit in your natual way of coding
 - it abstract tyhe DB system so you can change it whenever you want

ORM cors
> you have to learn it
> you have to set it up


# Hibernate
Hibernate is a java framework that simplifies the development of java application to interact with the database
it is an open source, lightweight, ORM tool
Hibernate implements the specification of JPA (Java Persistence API) for data persistence

an ORM tool simplifies the data creation, data manipulation and data access
it is a programming technique that maps the object to the data store in the database

THe ORM tool internally uses the JDBS API to interact with the database


# JPA
Java Persistence API is a java specification that provides certain functionality and standard to ORM tools
the javax.persistence package contains the JPA classes and interface

# Advantages of Hibernate Framework
1. open source and lightweight
2. fast performance - because of caching use internally
3. database independent query -  HQL(hibernate query language) is the object oriented version of SQL.
  it geberate the database dependent queries, so you dont need to write database specific queries
  before hibernate if database is changed for the project we need to change the sql queries that leads to problem of mantainence
4. automatica table creation
  hibernate framework provides the facility to create table automatically
5. simplies complex join - fetching data from multiple tables is easy
6. provides query statistices and database status


# Hibernate Architecture
It incluides many object such as persistence object, session factory, transaction factory, connection fractory,
session etc


Hibernate architecture is categorized into four layers
1. java application layer
2. hibernate framework layer
3. backend api layer
4. database layer

Hibernate framework uses many object such as sessionFractory, SessionTransaction etc along with
existing java API such as JDBC (Java dataabse connectivity) , JTA(Java Transaction API)

# Elements of Hibernate Architecture

SessionFactory
It is a factory of session and client of ConnectionProvider, it is an interface provides factory method to get
the object of session


Session
It is an object provides an interface between the application and data stores in the database
it is short lived object and wrap the JDBC connection


Transaction
it is an object specifies the atomic unit of work


ConnectionProvider
It is a factory of JDBC coonection


# How to use hibernate
1. create the persistence class
2. creating the mapping file for persistence class
3. create the configuration file
4. create the class that retrives or stores the persistence object
5. load the jar file
6. run the first hibernate app


1. create the persistence class
A simple persistence class should follow some rules
- A no argument constructor: it is recommanded to have default constructor so that hibernate can create the instance
of the persistence class
- provide an identifier property; it is better to assign an attribute as id.
 this attribute behave as a primary key in database
- declare getter and setter method
- prefer non-final class

2. creating the mapping file for persistence class
the mapping file name conventionally should be class_name.hbm.xml
there are many elements of the mapping file
- hibernate-mapping - it is the root element in the mapping file that contain all the mapping element
- class - it is sub-element of the hibernate-mapping element. it specifies the persistence class
- id - it is sub-element of class. it specified the primary key attribute in the class
- generator - it is sub-element of id, it is used to generate the primary key
- property - it is sub-element of class that specifies the property name of persistence class

3. creating a configuration file
the config file contain information about the database and mapping file
conventionally i name shoudl be hibernate.cfg.xml

4. create the clas that retrive or store the object
we can simply store the persistent class object to the database


# Common use hibernate annotation
@Entity - use to makr any class an entity
@Table - use to change the table details
@Id - use to mark column as id (primary key)
@GenerateValue - hibernate will automatically generate values for that using interanl sequence
@Column - can be used to specify column mapping
@Transient - this tell hibernate not to save this field
@OneToOne, @OneToMany, @ManyToOne, @ManyToMany


# Dialect
the dialect specifies the type of database used in hibernate so that hibernate generate appropriate type of sql statement
for connecting any hibernate application with the database it is required to provide the configuration of sql dialect


Oracle
MySQL
Postgrss


# Save data

save()

# fetch data

get()
load()

get()
- get method of hibernate session returns null if the object is not found in cache as well as on database
- use if you are not sure that object exists in databbase or not
- get() involve database if objet doesn't exist in the session cache and return a fully initialized object
  which may involve several database call


load()
- this method throw ObjectNotFoundException if object is not found on cache as well as database but never return null
- use if you are sure that object exist
- load method can return proxy in place and only initialize the object or hit the dataabse of any method other then
  getId() is called on entity object
  this lazy initialization increase the performace


# Create first hibernate app
1. create maven project
2. add two dependencues in the pom.xml
  - hibernate-core
  - mysql-connector-java

<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.6.1.Final</version>
</dependency>



<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.27</version>
</dependency>


3. hibernate configuration - hibernate.cfg.xml

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/revature</property>
        <property name="connection.username">root</property>
        <property name="connection.password">root</property>
        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
        <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
        <mapping class="com.revature.Employee" />
    </session-factory>
</hibernate-configuration>


4. create persistent class
 @Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String email;

    public Employee(){}

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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
}


5. app.java
create connection
open session
start transaction
create employee object
save
commit
close










