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





# JDBC