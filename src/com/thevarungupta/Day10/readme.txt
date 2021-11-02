# MySQL Index

- An index is a data structure that allows us to add indexes in the existing table
- It enables you to improve the performance of your queries
- it improve the faster retrival of records on a database table
- it create an entry for each value of the indexed columns and we use it quickly to find a record without searching each and
  every row in the table
- we can create an index by using one or more column

Example
Employee
 - Id
 - Name
 - Email 
 - Age


# How to create an index

Syntax
------
> create index <index_namn> on <table_name>(column <col_name>)

# Create
> create index ix_name on employee(name);

# Drop
> drop index <index_name> on table_name

# Show indexes
we get the index information of a table using the show indexes statement


> show indexes from table_name
> show indexes from table_name IN database_name.table_name

> show keys from table_name in database_name

# Show index query returns following information
- Table = it contain table name
- Non_unique: it return 1 if the index contain duplicate value else it return 0
- Key_name: it is the name of the index, if the table contain a primary key, the index name is always PRIMARY
- Seq_in_index: it is the sequence number of the column in the index that starts from 1
- column_name: it contain the name of column 
- collation : it gives information about the column is sorted in the index
		A - Ascending
		D - descending
		Null - not sorted
- Cardinality: it gives as seatimated number of unique value in the index table where higher cardinality represent
		a greater chance of using indexes
- sub_part: It is a prefix of the index, it is NULL value if all the column of the table is indexed, it will return the
            number of indexes characters when column are partially indexes
- packed: it tell how is key id packed, otherwise it will null
- NULL: it contain blank of the column does not have NULL Value, otherwise it return true
- index_type: it contain th name of the index method like BTREE, HASH, FULLTEXT etc
- comment: it contain the index info when they are not described
- visible - it contain yes if the index is visible to query optimizer otherwise no
- expression - it contain some expression


# Type of indexes
- Unique index
- clustered index
- Non clusterd index



# Unique index
Indexing is a process to find an unordered list into an ordered list that allows us fast retrival of the records
it create an entry for each value that apeears in the index column

we use primary key constraint to enfore the unique value of one or more columns
But we can use only one primary key for each table
so if we want to make multiplr sets of column with unique value then the primary key constraint will not be use

Mysql allow enother constraint called UNIQUE index to enforce the uniqueness of the value in one or more column

we can create more then one unique index in a single table which is not possible with the primary key constaint

Syntex
------
Create unique index <index_name> on <table_name>(col1, col2)

MySQL alsp allow us another approach to enfore unique value in one or more column by using UNIQUE KEY

if we use UNIQUE constraint in the table MyQL automatically create a unique index behind the scene

Syntax
----
create table <table_name>(col1, col2) constraint <col_name> UNIQUE key (col_name)


> create unique index_ix_name_unique on employee (name);
> create table employee(id, integer, name), unique key ix_name_unique (name)


# Clustered Index
- A clustered index is actually a table where the data for the rows are stored
- it defines te order of the table data
- Each table can only have one clusterd index
- if table column contrains a primary key mysql allow you to create a clustered index name PRIMARY based on specified column


# Features
- it helps us to store data and indexes at the same time
- it stires data in only one way based on key value
- clusterd index allow us one or more column for creating an index

Syntex
----
create table table_name (id integer, name char(50), primary key (id))  // clusterd index


# Non-clusterd index are also known as secondary index
the non-clusterd index are table data both are stored in different place
it will not sort the table data
MySQL allows a table to store one or more then one non-clusterd index
non-clusterd index improves the performance of the queries which uses key without assigning primary key

Syntex
-----
create nonclustered index <index_name> on table_name (column ASC | DESC)

# Difference between clusterd and non-clusterd index
both indexes have the same physical structure and are store as BTREE structure in the Mysql server database
0 primary index are known as clusted index
- any other index other then primary indexes is called non-clustserd index


# Store Procedures
A procedure is a collection of pre-compiled SQL statement stored inside the database
It is a subProgram in the regular computing langugage
A procedure always contain
- name
- parameter list
- sql statement


we can invoke procedure by using other procedures, triggers and application

# Features
- Store procedures increases the performance of the applicatio, once the store procedure are created  they are compiled
  and stored in the database
- store procedure reduces the interaction between app and database server, because the application has to send only store
  procedure name and required parameters instead of passing multiple sql statement
- store procedure are reuable and transparent to any app
- procedure is always secure, you can avoid one of critical type of attack know as SQL injection


Syntax
------

create procedure <procedure_name>[parameters]
begin
	declaration_section

	executable_section
end


call <procedure_name>(parameters)

procedure_name - it means the name of the procedure
parameters - it means number of parameters
declaration section - it means declaration of all variable
executable_section - it means the cde for functionexecution

# type of procedures
- In parameters
- Out parameter
- input parameters (in + out)

DELIMITER //
create procedure sp_get_employee()
BEGIN
 select id, name, email from employee;
END //
DELIMITER ;

call sp_get_employee()


# In Parameter
in this procedure we have the IN parameter of any type to accept a value from the user

select * from employee where age < 30

DELIMITER //
create procedure sp_get_employee_age(IN var1 INTEGER)
BEGIN
	select * from employee where age < var1;
END //
DELIMITER ;



CALL sp_get_employee_age(30)


# OUT parameter
In this procedure we will have out parameter

DELIMITER //
create procedure sp_max_employee_age(OUT var1 INTEGER)
BEGIN
	select MAX(age) into var1 from employee;
END //
DELIMITER ;


CALL sp_max_employee_age(@result)
select @result

# INOUT parameter
in this procedure we have to use the IN OUT parameters

DELIMITER //
create procedure sp_max_employeee(INOUT var1 INTEGER)
BEGIN
	select age into var1 from employee where id = var1;
END //
DELIMITER ;

> SET @R = '1';
> CALL sp_max_employeee(@R);
> select @R



# List of store procedure

show procedure status where db = 'demo';

# Drop procedure

DROP PROCEDURE <name>

# ALTER procedure <procedure_name>()



# How can we read the data from two or more tables
- Set opeartion
- Joins


# Set Operation
It is used to combine the two or more sql statements

# Types of Set Opeartions
1. Union
2. UnionAll
3. Intersect
4. Minus


1. Union
- THe SQL Union operation is used to combine the result of two or more SQL Select queries
- In the union opeartion all the number of data type and column must be same in both the table 
- The union operation eliminates the duplicate rows from its resultset

mysql> select * from emp_usa; select * from emp_uk;
+------+-------+-------------+
| id   | name  | email       |
+------+-------+-------------+
|    1 | mark  | m@gmail.com |
|    2 | paul  | p@gmail.com |
|    3 | smith | s@gmail.com |
|    4 | stacy | s@gmail.com |
+------+-------+-------------+
4 rows in set (0.00 sec)

+------+--------+-------------+
| id   | name   | email       |
+------+--------+-------------+
|    5 | john   | j@gmail.com |
|    6 | watson | w@gmail.com |
|    7 | rangel | r@gmail.com |
+------+--------+-------------+
3 rows in set (0.00 sec)
mysql> select * from emp_usa union select * from emp_uk;
+------+--------+-------------+
| id   | name   | email       |
+------+--------+-------------+
|    1 | mark   | m@gmail.com |
|    2 | paul   | p@gmail.com |
|    3 | smith  | s@gmail.com |
|    4 | stacy  | s@gmail.com |
|    5 | john   | j@gmail.com |
|    6 | watson | w@gmail.com |
|    7 | rangel | r@gmail.com |
+------+--------+-------------+
7 rows in set (0.00 sec)


Union ALL
>  select * from emp_usa union all select * from emp_uk;


# Joins
Joins are used with select statement to retrive data from multiple table
it is performed whenever you need to fetch record from two or more tables

# Type of joins
1. inner join - simple join
2. left outer join - left join
3. right outer join - right join


# Inner Join
IT is used to return all rows from multiple table where the join statement is satisfied
it is one of most common type of join

select <column> from table1 inner join table2 on table1.column = table2.column

select student_id, student_name, city from student inner join technologies on student.student_id=technologoies.student_id;

+------------+--------------+------+
|          1 | mark         | USA  |
|          2 | paul         | USA  |
|          3 | Watson       | USA  |
+------------+--------------+------+
3 rows in set (0.00 sec)

+---------+-----------+------------+
| tech_id | tech_name | student_id |
+---------+-----------+------------+
|       1 | java      |          1 |
|       2 | html      |          2 |
|       3 | spring    |          3 |
+---------+-----------+------------+
3 rows in set (0.00 sec)

mysql> select student_id, student_name, city from student inner join technologies on student.student_id=technologoies.student_id;
ERROR 1052 (23000): Column 'student_id' in field list is ambiguous
mysql> select student_id, student_name, city from student inner join technologies on student.student_id=technologies.student_id;
ERROR 1052 (23000): Column 'student_id' in field list is ambiguous
mysql> select student.student_id, student.student_name, student.city from student inner join technologies on student.student_id=technologies.student_id;
+------------+--------------+------+
| student_id | student_name | city |
+------------+--------------+------+
|          1 | mark         | USA  |
|          2 | paul         | USA  |
|          3 | Watson       | USA  |
+------------+--------------+------+
3 rows in set (0.00 sec)

mysql> select student.student_id, student.student_name, student.city, technologies.tech_name from student inner join technologies on student.student_id=technologies.student_id;
+------------+--------------+------+-----------+
| student_id | student_name | city | tech_name |
+------------+--------------+------+-----------+
|          1 | mark         | USA  | java      |
|          2 | paul         | USA  | html      |
|          3 | Watson       | USA  | spring    |
+------------+--------------+------+-----------+
3 rows in set (0.00 sec)

mysql> select s.student_id, s.student_name, s.city, t.tech_name from student s inner join technologies t on s.student_id=t.student_id;

# Inner join with Using clause

mysql> select student_id, student_name, tech_name from student inner join technologies USING (student_id);

# inner join with where clause

mysql> select student_id, student_name, tech_name from student inner join technologies USING (student_id) where tech_name = "java";
+------------+--------------+-----------+
| student_id | student_name | tech_name |
+------------+--------------+-----------+
|          1 | mark         | java      |
+------------+--------------+-----------+
1 row in set (0.00 sec)


# Left Join
this is similar to the inner join that can be use to select common data and all data from left side table
in the left join clause returns all the rows from left table and matched record from right side table

mysql> select c.cust_id, c.cust_name, o.order_id, o.amount from customer c left join orders o on c.cust_id=o.cust_id;


# Right join

mysql> select c.cust_id, c.cust_name, o.order_id, o.amount from customer c right join orders o on c.cust_id=o.cust_id;



# Self Join
A self join is a join which is used to joiun a table with itself
we can perform self join usig table aliase
table aliases allow us not to use the same table name twice with a single statement

Problem Statement:
I Want to find out all the employees whose salary equal to salary of mark and i dont know mark salary;

Solution 1:
mysql> select * from employee where name = 'mark';
mysql> select * from employee where salary = 5000;

Solution 2:
mysql> select * from employee where salary = (select salary from employee where name = 'mark');

Solution 3:
mysql> select e1.id, e1.name, e1.salary from employee e1, employee e2 where e1.salary = e2.salary and e2.name = 'mark';


# View
- A view is a databse object that has no values
- It content are based on the base table
- It contains row and column similar to the real table
- View can be calle a virtual table
- it operate similar to the base table but does not contain any data of its own


Syntex
-------
create view view_name as select * from table


# TCL- Transaction control language

Transaction consist of four main properties which refered to as ACID property

A - atomoicity
C - consistency
I - isolation
D - durablity

1. Atomicity 
It ensures that all statement or operation within the transaction unit must be executed successfully
otherwise operation is failed the whole transaction will be aborted and it goes rolled back into their previous state

commit statement
rollback 
auto-commit


2. Consistency
Th word consistency means that value should remain preserved always. In database the integrity of the data should be maintained
which means if a change in the databse is made it should remain preserved always
In the case of transaction the integrity of the data is very essential so that datanase remain consistent before and after
the transaction

crach recovery


3. Isolation
This perperty guarantees that each operation unit operated independently
set isolation level statement
auto coommit



4. durability
this property guarantee that the result of committed tansaction persist permanently even if the system crashes or failed
in database durability ensures that the data after successfully execution of the operation become permanent



Bank
A - 100
B - 100

Steps
1. begine the transaction using state transaction statement
2. then select statement whiuch we want to execute
3. add record to the table
4. use the commit statement to complete tranmsaction


mysql> start transaction;

mysql> update bank set balance = balance -10 where account_number = 1;

mysql> update bank set balance = balance +10 where account_number = 20;

mysql> select * from bank;
+----------------+--------------+---------+
| account_number | account_name | balance |
+----------------+--------------+---------+
|              1 | A            |      90 |
|              2 | B            |     100 |
+----------------+--------------+---------+

mysql> rollback;

mysql> select * from bank;
+----------------+--------------+---------+
| account_number | account_name | balance |
+----------------+--------------+---------+
|              1 | A            |     100 |
|              2 | B            |     100 |
+----------------+--------------+---------+



# Normalization
- Normalization is the process of oragnizing the data in tha database
- Noramlization is used to minimize the redundancy from a relation or set of relations
- Normalization divides the larger table into smaller table and links them using relationship
- Th e normal form is used to reduce redundancy from the database table

Type of Normal forms
1. INF - A relation is in 1NF if it contains an atomic value
2. 2NF - A relation will ne in 2NF if it is in 1NF and all non key attributes are fullu functional dependent on primary key
3. 3NF - A relation will be 3NF if it is in 2NF and no transition dependency exist
4. BCNF



# INF - first normal form

Employee
id	name	phon		country
1	john	999999		USA
		888888
2	Paul	555555		UK


after INF
Employee
id	name	phon		country
1	john	999999		USA
1	john	888888		USA
2	Paul	555555		UK


# 2NF
Teachers
t_id		t_age		subject
1		30		Computer
1		30		math
2		28		English
	


teacher_detail
t_id	t_age
1	30	
2	25

teacher_subject
t_id		subject
1		Math
1		Computer













