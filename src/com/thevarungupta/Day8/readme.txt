# MySQL

# DDL
# DML
# DQL

# MySQL Contraints
> These constraints in MySQL is used to specify the rules that allows or restrict what value / data will be 
stored in the table
> they provide a suitable method to ensure data accuracy and integrity inside the table

# Type of constraints
1. column level constraint - are applied only to the single column that limit the type of particular column data
2. table level constraint - are applied to the entire table that limit type of data for the whole table

> NOT NULL
mysql> create table employee (id integer, name char(50) NOT NULL, email char(50) NOT NULL);
mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | YES  |     | NULL    |       |
| name  | char(50) | NO   |     | NULL    |       |
| email | char(50) | NO   |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
3 rows in set (0.01 sec)
> Check

mysql> create table employee (id integer, name char(50), age integer CHECK(age >= 18));

> default
mysql> create table employee (id integer, name char(50), country char(50) DEFAULT 'USA');
mysql> describe employee;
+---------+----------+------+-----+---------+-------+
| Field   | Type     | Null | Key | Default | Extra |
+---------+----------+------+-----+---------+-------+
| id      | int      | YES  |     | NULL    |       |
| name    | char(50) | YES  |     | NULL    |       |
| country | char(50) | YES  |     | USA     |       |
+---------+----------+------+-----+---------+-------+
3 rows in set (0.01 sec)

> primary key
mysql> create table employee (id integer PRIMARY KEY, name char(50));
Query OK, 0 rows affected (0.01 sec)

mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | NO   | PRI | NULL    |       |
| name  | char(50) | YES  |     | NULL    |       |
+-------+----------+------+-----+---------+-------+
2 rows in set (0.00 sec)


> auto_increment
mysql> create table employee (id integer primary key AUTO_INCREMENT, name char(50));
Query OK, 0 rows affected (0.02 sec)

mysql> describe employee;
+-------+----------+------+-----+---------+----------------+
| Field | Type     | Null | Key | Default | Extra          |
+-------+----------+------+-----+---------+----------------+
| id    | int      | NO   | PRI | NULL    | auto_increment |
| name  | char(50) | YES  |     | NULL    |                |
+-------+----------+------+-----+---------+----------------+
2 rows in set (0.01 sec)


> unique
mysql> create table employee (id integer, name char(50), email char(50) UNIQUE);
Query OK, 0 rows affected (0.03 sec)

mysql> describe employee;
+-------+----------+------+-----+---------+-------+
| Field | Type     | Null | Key | Default | Extra |
+-------+----------+------+-----+---------+-------+
| id    | int      | YES  |     | NULL    |       |
| name  | char(50) | YES  |     | NULL    |       |
| email | char(50) | YES  | UNI | NULL    |       |
+-------+----------+------+-----+---------+-------+


> enum
mysql> create table employee (id integer, gender ENUM('male', 'female'));
+--------+-----------------------+------+-----+---------+-------+
| Field  | Type                  | Null | Key | Default | Extra |
+--------+-----------------------+------+-----+---------+-------+
| id     | int                   | YES  |     | NULL    |       |
| gender | enum('male','female') | YES  |     | NULL    |       |
+--------+-----------------------+------+-----+---------+-------+
2 rows in set (0.00 sec)


# ADvance Queries
# MySQL Clauses
> where
> distinct
> from
> order by
> group by
> having

# MySQL where clause
where clase is used to write condition

where - single condition				

> select * from employee wheer id = 1;

AND - bith side condition should be true

> select * from employee where id = 1 and name = 'mark';

OR - any condition from any side should be true

> select * from employee where id  =1 and name = 'Paul';

mysql> select * from employee where status != 'true';
+------+------+-------------+--------+
| id   | name | email       | status |
+------+------+-------------+--------+
|    4 | john | j@gmail.com | false  |
+------+------+-------------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where name = 'mark' and status = 'true';
+------+------+-------------+--------+
| id   | name | email       | status |
+------+------+-------------+--------+
|    1 | mark | m@gmail.com | true   |
+------+------+-------------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where name = 'mark' and status = 'false';
Empty set (0.00 sec)

mysql> select * from employee where name = 'mark' or status = 'false';
+------+------+-------------+--------+
| id   | name | email       | status |
+------+------+-------------+--------+
|    1 | mark | m@gmail.com | true   |
|    4 | john | j@gmail.com | false  |
+------+------+-------------+--------+
2 rows in set (0.00 sec)

mysql> select * from employee where name = 'mark' or status = 'true';
+------+--------+-------------+--------+
| id   | name   | email       | status |
+------+--------+-------------+--------+
|    1 | mark   | m@gmail.com | true   |
|    2 | paul   | p@gmail.com | true   |
|    3 | watson | w@gmail.com | true   |
+------+--------+-------------+--------+
3 rows in set (0.00 sec)

# Distinct
it is used to remove duplicate records from the table and fetch only unique record

select DISTINCT id from users

mysql> select DISTINCT status from employee;
+--------+
| status |
+--------+
| true   |
| false  |
+--------+
2 rows in set (0.00 sec)


# Order By
it is used to sort the record in ascending or descending order

select * from employee order by col asc / desc

> select * from employee order by id;
> select * from employee order by id DESC;

mysql> select * from employee order by name ASC;
+------+--------+-------------+--------+
| id   | name   | email       | status |
+------+--------+-------------+--------+
|    4 | john   | j@gmail.com | false  |
|    1 | mark   | m@gmail.com | true   |
|    2 | paul   | p@gmail.com | true   |
|    3 | watson | w@gmail.com | true   |
+------+--------+-------------+--------+
4 rows in set (0.00 sec)

mysql> select * from employee order by name DESC;


# Group by
it is used to collect data from multiple records and group the result by one or more columns
it is mostly used with select
you can also use aggregate function like count, sum, max and min

select expression1, expression2 from table by expression1


mysql> select job, count(job) from employee group by job;
+---------+------------+
| job     | count(job) |
+---------+------------+
| admin   |          2 |
| clerk   |          1 |
| manager |          1 |
+---------+------------+
3 rows in set (0.00 sec)


min
max
sum
avg

mysql> select * from employee;
+----+--------+--------+------+---------+
| id | name   | salary | age  | job     |
+----+--------+--------+------+---------+
|  1 | mark   |   5000 |   20 | admin   |
|  2 | paul   |   4000 |   26 | clerk   |
|  3 | watson |   8000 |   30 | admin   |
|  4 | john   |  18000 |   50 | manager |
|  5 | stacy  |  12000 |   30 | clerk   |
|  6 | rangel |  22000 |   30 | manager |
+----+--------+--------+------+---------+
6 rows in set (0.00 sec)

mysql> select job, sum(salary) from employee group by job;
+---------+-------------+
| job     | sum(salary) |
+---------+-------------+
| admin   |       13000 |
| clerk   |       16000 |
| manager |       40000 |
+---------+-------------+
3 rows in set (0.00 sec)

mysql> select job, sum(salary), min(salary), max(salary), avg(salary) from employee group by job;
+---------+-------------+-------------+-------------+-------------+
| job     | sum(salary) | min(salary) | max(salary) | avg(salary) |
+---------+-------------+-------------+-------------+-------------+
| admin   |       13000 |        5000 |        8000 |   6500.0000 |
| clerk   |       16000 |        4000 |       12000 |   8000.0000 |
| manager |       40000 |       18000 |       22000 |  20000.0000 |
+---------+-------------+-------------+-------------+-------------+
3 rows in set (0.00 sec)

# Having
it is used with group by clause
it always return the row where coindition is true;

mysql> select job, sum(salary) from employee group by job having age > 26;
ERROR 1054 (42S22): Unknown column 'age' in 'having clause'
mysql> select job, sum(salary) from employee group by job;
+---------+-------------+
| job     | sum(salary) |
+---------+-------------+
| admin   |       13000 |
| clerk   |       16000 |
| manager |       40000 |
+---------+-------------+
3 rows in set (0.00 sec)

mysql> select age, job, sum(salary) from employee group by job;
+------+---------+-------------+
| age  | job     | sum(salary) |
+------+---------+-------------+
|   20 | admin   |       13000 |
|   26 | clerk   |       16000 |
|   50 | manager |       40000 |
+------+---------+-------------+
3 rows in set (0.00 sec)

mysql> select age, job, sum(salary) from employee group by job age > 25;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'age > 25' at line 1
mysql> select age, job, sum(salary) from employee group by job having age > 25;
+------+---------+-------------+
| age  | job     | sum(salary) |
+------+---------+-------------+
|   26 | clerk   |       16000 |
|   50 | manager |       40000 |
+------+---------+-------------+
2 rows in set (0.00 sec)


# AND
# OR
# AND OR
# LIKE

%
wild card

mysql> select * from employee where name LIKE '%el';
+----+--------+--------+------+---------+
| id | name   | salary | age  | job     |
+----+--------+--------+------+---------+
|  6 | rangel |  22000 |   30 | manager |
+----+--------+--------+------+---------+
1 row in set (0.00 sec)

mysql> select * from employee where name LIKE '%a%';
+----+--------+--------+------+---------+
| id | name   | salary | age  | job     |
+----+--------+--------+------+---------+
|  1 | mark   |   5000 |   20 | admin   |
|  2 | paul   |   4000 |   26 | clerk   |
|  3 | watson |   8000 |   30 | admin   |
|  5 | stacy  |  12000 |   30 | clerk   |
|  6 | rangel |  22000 |   30 | manager |
+----+--------+--------+------+---------+
5 rows in set (0.00 sec)

mysql> select * from employee where name LIKE '_a%';
+----+--------+--------+------+---------+
| id | name   | salary | age  | job     |
+----+--------+--------+------+---------+
|  1 | mark   |   5000 |   20 | admin   |
|  2 | paul   |   4000 |   26 | clerk   |
|  3 | watson |   8000 |   30 | admin   |
|  6 | rangel |  22000 |   30 | manager |
+----+--------+--------+------+---------+
4 rows in set (0.00 sec)

mysql> select * from employee where name LIKE '_a_k%';
+----+------+--------+------+-------+
| id | name | salary | age  | job   |
+----+------+--------+------+-------+
|  1 | mark |   5000 |   20 | admin |
+----+------+--------+------+-------+
1 row in set (0.00 sec)




# MySQL Key
1. Unique Key
2. Primary Key
3. Forign Key
4. Composite Key


# Unique key
it is a signle field that ensure all values that going to store into the column will be unique
It means a column cannot have a duplicate values

MySQL allows us to use more than one column with unique constraint in a table
It can accept null

Rules
-----
1. it is useful when we want a column cannot have a identical values
2. it store only distinct value that maintain the integrity and reliablity of the database
3. it can contain null value but only once
4. it can also work with forigh key in prventing the uniqueness of the table



Syntax
------
create table table_name (col data_type UNIQUE)

create table employee (id integer, name char(50), email char(50) , CONSTRAINT uq_name_email UNIQUE(name, email));

multi column key - database will not allow to store the value in both column in same combination


# Primary key
primary is used identify each record in a table uniquely
if a column contains primary key it cannot be null or empty
when you insert a new row into a table the primary key column can also use AUTO_INCREMENT attribute to generate
a seqential number for the row automatically
MySQl automatically create an index for primary column

Rule
---
1. primary key column value must be unique
2. each table can contain only one primary key
3. the primary key column cannot be null
4. MySQL does not allow us insert a new row with existng primary key
5. it is recomanded to use Int as a data type for primary key column

> create table employee (id integer primary key AUTO_INCREMENT, name char(50))
> create table users (id integer, name char(50), primary key(id));

# Foreign key
it is used to link one or more then one table together
it is also know as referencing key
A foreign key matche the primary key field of another table
it means a foreigh key field in one table refers to the primary field of the other table
it is very important to maintain referential integrity in MySQL

A forign key make it possible to create a parent-child relationship with the table

custom
- cust_id
 - name
 - email
 - phone


Address
 - Address_id
 - cust_id
 - city
 - country
mysql> create table address (address_id integer primary key auto_increment, cust_id integer, city char(50), constraint fk_customer FOREIGN KEY (cust_id) REFERENCES customner(cust_id));
Query OK, 0 rows affected (0.03 sec)

mysql> describe customer;
ERROR 1146 (42S02): Table 'revature.customer' doesn't exist
mysql> describe customner;
+---------+----------+------+-----+---------+----------------+
| Field   | Type     | Null | Key | Default | Extra          |
+---------+----------+------+-----+---------+----------------+
| cust_id | int      | NO   | PRI | NULL    | auto_increment |
| name    | char(50) | YES  |     | NULL    |                |
| email   | char(50) | YES  |     | NULL    |                |
+---------+----------+------+-----+---------+----------------+
3 rows in set (0.01 sec)

mysql> describe address;
+------------+----------+------+-----+---------+----------------+
| Field      | Type     | Null | Key | Default | Extra          |
+------------+----------+------+-----+---------+----------------+
| address_id | int      | NO   | PRI | NULL    | auto_increment |
| cust_id    | int      | YES  | MUL | NULL    |                |
| city       | char(50) | YES  |     | NULL    |                |
+------------+----------+------+-----+---------+----------------+
3 rows in set (0.00 sec)


















# JDBC