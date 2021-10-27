# Data
> A data is a piece of information which we want to store
> It is fact which might be important which we need to preserve for future reference

# Type of data
1. structured data - Table - RDBMS - MySql, SQl Server, Oracle, Sqlite
2. sem-structured data - JSON - NoSQL - MongoDB, Cassandra, Redis etc
3. unstructured data - Photos, Videos, Audio, files - AWS S3, Azure Blobs


# Database
A database is an application that stores and organized collection of records
It can be accessed and managed by user very easily
It allows us to organize the data into table, rows and columns
and find the data more effieciently it also provide indexes




# What is MySQL? - 
> MySQL is one of the most popular database management system used for managing relationaldatabase
It is open source database which supported by Oracle
It is fast, scalable and easy to use
It also very powerfull database


# RDBMs (Relational Database Management System)
In this type of database data is stored in table and table can have relationship
Student - student list / data
Course - course info

It is a database management system that is based on the relational model as invented by Edgar D Codd by
organizes and stores data in form of the table

> It allows us to implement database operation on table, rows and column
> It define the database relationshoip in form of table
> it provides the referential integrity between rows and column of various table
> it allows us to update the table indexes automatically
> it uses many SQL queries and combine usefull information from multiple tables with the help of joins


DBMS - Database Management System
> store in files
> relationaship b/w tables or files are maintain programmatically
> does not support clint and server distributed architecture
> normalization is not avialble
ex: file system, xml etc

RDBMS - Relational Database Management System
> store in tabular form
> relationship between tables can be specified at the time of table creation
> support client and distributed server arch
> it is available
> ex: mysql, sql server etc


# Entity
any real world object or thing which have data that can be store

# Relationship
1 - one to one
2 - one to many
3 - many to many

# Data Type
1. numeric data type - tinyint, smallint, int, float, doulbe
2. data and time - year, date, time etc
3. string data type - char(size), varchar()

char(20)
varchar(20)


# SQL Statement
SQL statementr are used to perform database operation
these sql statement can be divided into three main catewgories
1. DDL - data defination language
1. DML - data manipulation language 
3. DQL - data query mangugae
4  TCL - transaction control language

# DDL - Data Defination Language
It consist of SQL command that can be used to define the database schema
it simply deals with description of database schema and is used to create and modify
the structure of database object in the database

create
drop
alter
tuncate


> mysql --version

> mysql -u <username> -p
> <password>

> mysql -u root -p
> root

> show databases;

# Create
---------
> create database <database_name>;

> use <database_name>;

> create table <employee>; (wrong)

> create table <table_name>(<column_name> <data_type>)

> create table employee (id integer, name char(20));

> show tables;

> describe <table_name>;

# Drop
--------
1. database
2. table

> drop table <table_name>;
> drop database <database_name>;

# Alter
-------
1. Add new column
2. drop unwanted column
3. chnage data type of existing table
4. change name of existing column
5. rename table

> alter table <table_name> add column <column_name> <data_type>;
mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | YES  |     | NULL    |       |
| name  | char(20) | YES  |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> alter table employee add column email char(200);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> describe employee;
+-------+-----------+------+-----+---------+-------+
| Field | Type      | Null | Key | Default | Extra |
+-------+-----------+------+-----+---------+-------+
| id    | int       | YES  |     | NULL    |       |
| name  | char(20)  | YES  |     | NULL    |       |
| email | char(200) | YES  |     | NULL    |       |
+-------+-----------+------+-----+---------+-------+
3 rows in set (0.01 sec)


> alter table <table_name> drop column <column_name>;
mysql> describe employee;
+-------+-----------+------+-----+---------+-------+
| Field | Type      | Null | Key | Default | Extra |
+-------+-----------+------+-----+---------+-------+
| id    | int       | YES  |     | NULL    |       |
| name  | char(20)  | YES  |     | NULL    |       |
| email | char(200) | YES  |     | NULL    |       |
+-------+-----------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> alter table employee drop column email;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | YES  |     | NULL    |       |
| name  | char(20) | YES  |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
2 rows in set (0.00 sec)



> alter table <table_name> modify <column_name> <data_type>();

mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | YES  |     | NULL    |       |
| name  | char(20) | YES  |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> alter table employee modify name varchar(50);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> describe employee;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int         | YES  |     | NULL    |       |
| name  | varchar(50) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.01 sec)

> alter table <table_name> change  <col_old_name> <col_new_name> varchar(50);

mysql> describe employee;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int         | YES  |     | NULL    |       |
| name  | varchar(50) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> alter table employee change name first_name char(50);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> describe employee;
+------------+----------+------+-----+---------+-------+
| Field      | Type     | Null | Key | Default | Extra |
+------------+----------+------+-----+---------+-------+
| id         | int      | YES  |     | NULL    |       |
| first_name | char(50) | YES  |     | NULL    |       |
+------------+----------+------+-----+---------+-------+
2 rows in set (0.01 sec)

> alter table <old_table_name> rename to <table_new_name>
mysql> show tables;
+--------------------+
| Tables_in_revature |
+--------------------+
| employee           |
+--------------------+
1 row in set (0.00 sec)

mysql> alter table employee rename to emp_table;
Query OK, 0 rows affected (0.01 sec)

mysql> show tables;
+--------------------+
| Tables_in_revature |
+--------------------+
| emp_table          |
+--------------------+
1 row in set (0.00 sec)


# DML - Data manipulation Language
SQL command that deals with the data manipulation of data present in the database belong to DML
- Insert 
- Update
- Delete

> insert into <table_name> values (val1, val2); 
> insert into <table_name> (col1, col2) values (val2, val2);

> update <table_name> set <col> = val where (condition)

> delete from <table_name> where (condition)



# DQL
data query language
- select

all rows all column
all rows limited column
limited row limited column
limited row and all column

> select * from <table>
> select <col_name1>, <col_name_2> from <table>
> select <col_name1>, <col_name_2> from <table> where id = 1
> select * from <table_name> where col_name = val1











