# Java

# What is Java?
It is a programming langugage
It is high level, robust, object-oriented and secure programming langugage

# Type of App
1. Desktop app such as notepad
2. Web application
3. Enterprice app such as banking , insurence app
4. Console App
5. Mobile
6. Embedded system
7. Games


# Java Editions
1. Java SE (Standard Edition)
2. Java EE (Enterprise edition)
3. Java ME (Micro edition)
4. JavaFX


# Features
1. Simple
2. Object-Oriented
3. Platform independent
4. Secured
5. Robost
6. Portable
7. High Performance
8. Multi-threading


# Difference between JDK, JRE and JVM
JDK - Java Developer Kit
JVM - Java Virtual Machine
JRE - Java Run time


# JVM
- It is called a virtual machine beacise it does not exist physically
- It provide specification in which java bytecode can be execute

What are the main task perform by JVM
1. Loads code
2. verify code
3. execute code
4. provide runtime enviornment


# JRE
The Java runtime enviornment is a set of software tool which are used for developing java application
> it it contains a set of libraries + other files that JVM uses at run time

# JDK
Java development kit
it is a software development kit which is used to develop java application
JDK contain a private JVM and few other resources such as compiler, loader, etc


# JVM Architecture

It is a specification where working of java virtual machine is specified
it is an implementation and its implementation is know as Java Runtime Env
It is runtime instance wherever you write java command on the command promit to run the java class, a instance
of the JVM is created


1. class Loader - it is subsystem of JVM which is used to load class files. whenever we run java program it is loaded
first by the class loader and there are 3 built in class loader in java
> bootstrap class loader
> extension class loader
> system / application class loader

2. Class Area
3. Heap - it is runtime data area in which object are allocated
4. stack - it holds local variable and partial result and play a part in method invocation
5. Program counter register
6. native method stack

7. execution engine
> a virtual processer
> interpreter
> Just-In-Time (JIT) Compiler

8. Java Native interface



# First Java Program

class Hello{
  public static void main(String[] args){
   System.out.println("Hello World");
  }
}


> class keyword is used to declare a class in java
> Hello is the name of the class
> public keyword is an access modifer which decide the visiblity
> static is keyword used to create a static method which can access directly by the class name
> void is return type it means this method does not return any value
> main represent the starting point of the program
> String[] args  is used for command line arguments
> System.out.println() it is used to print statement

Note:
1. java is case sensative - A a
2. in the entire app we can have only one main method
3. main method is the starting point of the programe
4. all statements in java should end with semicolon ;


# Variables
A variable is a container which holds the value while java program is executed
A variable is assigned with a data type
variable is a name of memory location

there are three type of variable
1. local
2. instance 
3. static variable

# Local variable
A variable declared inside the body of the method is called local variable, you can use this variable only within that
method and other method in a class are not aware of that variable

# instance variables
A variable declared inside the class but outside the body of the method
it is called instance variable beacuse its value is instance specific and is not shared amoung the instance

# static variable
variable that is declared with static keyword are called static variable
it cannot be local variable
static variable are shared amoung all instance of the class
memory allocation for varaible happens only once when the class is loaded in the memory

# Data Type
Data type specify the different size and vale that can be stire in the variable

Daa type are of two types
1. primitive type - simple type - char, boolean, int, long, float etc
2. Non primitve type - complex type - classes, interface and array

Date type		default size
boolean			1 byte
char			2 byte
short			2 byte
int			4 byte
long			8 byte
float			4 byte
double 			8 byte


# Operators
> arithmetic
> Relational 
> logical 
> ternery opeartor
> assignment

# Arithmatic 	- 	+ - * / %     
# Relational 	- 	> < >= <= ==	
# logical 	-	&& ||
# ternary	- 	?:
# Assignment 	-	= += -= *=


ternery

(condition) ? "true": "false"

# conditional statement
> if statement
> if-else 
> if elseif if
> nested if 


if(condition){
  // code to be executed
}


# Switch 
we can use switch statement to execute single statement from multiple condition

# Loops
In programming langugage loops are used to execute a set of instruction repeadly when some condition is true

there are 3 type of loops in java
1. for
2. while
3. do-while

for loops
we can initialize a variable, check condition and increment / decrement value

Syntax
-----
for(initialzer; condition; incr / decr){
 // statement
}


# While loop is used to iterate a part of a program repeadly untill the specificied condition is true, as soon as
boolean condition become false the loop automatically stop

Syntax
-----
while(condition){
  // statement
}


# do-while
will make sure to execute the loop atleast once before checking the condition and then if condition is true
keep executing and if condition false terminate loop

syntax
-----
do{
 // statement
}while(condition);


# Jump Statement
> break
> continue

break is used inside a loop to terminate the existing statement and resume the control from next statement

continue is used to step over the current statement



































