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



















