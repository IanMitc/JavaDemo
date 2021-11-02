# JDBC

Java Database Connectivity
1. Register the Driver
2. Create Connection
3. Create Statement
4. Execute Queries
5. Close the connection

# DriverManager class
- It acts as an interface between user and driver
- It keeps track of the drivers that are available and 
- Handl eastablising the connection between the dataabse and appropriate drivers

> DriverManager class Method
- registerDriver(Driver)
- deregisterDriver(Driver)
- getConnection(url)
- getConnection(url, username, password)


# Connection interface
- A connection is the session between the java application and database
- the connection interface is a factory of statement, prepareStatement and DatabaseMetaData


# Connection interface common methods
- createConnection
- createConnection(resultSetType, resultSetConcurrency)
- setAuthCommit(boolean: status)  // default - true
- commit()
- rollback()
- close()

# Statement interface
- it provides methods to execute queries with the dataabse
- A statement interface is a factory of ResultSet which provide a factory method to get the object of ResultSet


> Statement interface common method
- ResultSet executeQuery(String query) - is used to execute select query and retunr object of ResultSet
- int executeUpdate(String query) - is used to execute the specified query, create, drop, update, insert, delete etc
- boolean execute(String query) - it is used to execute queries that may return multiple results
- int[] executeBatch() it is used to execute batch of command


# Result interface
- it maintains a cursor pointing to a row of a table
- initially the cursor point to the first row

> REsult interface common method
- next()
- previous()
- first()
- last()


# PrepareStatement interface
- it is a subinterface of statement
- it is used to execute parameetrized query

"insert into employee values (1, 'mark', 'm@gmail.com')"
"insert into employee values (?, ?, ?)"

we can pass parameetrs (?) for the values

why use PrepareStatememt?
Improve performance - as it will be faster because the query is compiled only once
Security - it avoid sql injection


# CReate a console application using Mysql and JDBC
1. Employee
Create a class as Employee which represent table and class field represent columns
Employee
- id
- name
- email

2. EmployeeDao (Data Access Object)
It is an interface that lists all the methods we want to implmenet in our application

3. EmployeeDaoImpl
This is a class that implements our EmployeeDao interface and provides the implementation of all the methods. we want to
write JDBC code to perform database operation

4. EmployeeDaoFactory
This is a class that contains a method and return EmployeDao interface, and the idea is to decouple interface and implementation
class so that if we change the implementation we can easily do it


5. dbConfig.properties
this is a particular file in java used to define configuration in a simple format, and also this can be the central place which
can be accessed from anywhere to get configuration

6. ConnectionFactory
this is a class responsable for returning connection class object

7. main 
in the main class, get the instance of the dao and call the appropriate method to perform database operation



Steps:
1. create new java project
2. add jdbc jar file
3. create employee class
4. create EmployeeDao







