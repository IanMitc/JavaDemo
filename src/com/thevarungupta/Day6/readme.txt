# Collection sorting

Sort()
we can use this method to perform sorting on a simple list

but in the case of complex or user define classes, we have to mention which property you want to perform sorting.

# Comparable
# Comparable interface where we have to implement compareTo() method which return integer value

> Java comparable interface is used to order the object of the user-define class
> this interface is found in java.lang package
> it contain only one method by the name compareTo(other object)


a - b - c - d

public int compareTo(Object obj)
this method is used to compare the current object with specified object and it returns
1. positive - current object is greater then the specified object = 1
2. negative - current object is less then the specified object = -1
3. zero - current object is equal to the specified object = 0

sort() - sorting in ascending order
reverse() - sorting in descending order



# Comparator
java comparator interface is used to order the object of a user-define class
this interface is java.util package and contains two methods

compare(object obj1, object obj2)
equal(object element)

It provides multiple sorting sequence, or you can sort the elements based on any data members


# Generics in Java
In java generic is a feature which allows to detach data type from method
it make you code flexibe and which can possibly work with any data type


# Problem if you use Object class as a data type
1. unnecessay bosing and unboxing take place which impact performace
2. method is no more type safe which means you can compare anything

Advantages:
1. type safety -  we can hold only a single type of object in generics
2. type casting is not required
3. compile time checking


# Generics class
> A class that can refer to any data type is know as generic class
> we can use T type parameter to create the generic class of a specified type


Syntax
-----
class MyClass<T>{
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return obj;
    }
}

this T can be replace by any data type like integer, string, employee

# Type parameters
T - type
E - element
K - key
N - number
V - value

# Generic methods
like generic class we can also create generic methods that can accept any type of parameters
here thescope of the argument is limited to the method where it is declared

it allow to create static as well as non static methods

# Wild card generics
? - question mark symbol represent the wild card element
it means any type
we can write <? extends Shape> it means any child class of shape can be use



# Java Lambda Expression
Lambda expression is a new and essential feature that was introduced in java 8
It provide clear and concise way to represent a method
the lambda expression is used to provide the implementation of an interface that has function
it save a lot of code

# functional interface
An interface that has only one abstract method is called functional interface
java provides an anotation @FuncionalInterface which can be use to delare an interface as a functional interface


Why use lambda expression
1. to provide the implementaion of function interface
2. less and concise code

Syntax
------
(parameters) -> {
  // body
}

lambda expression consist of three main components / parts
1. parameters - it can be empty or a list of parameter
2. arrow: it is used to link parameetrs list and body expression
3. body: it contain expression or statement for lambda


# Design Pattern

# What is design pattern?
> Design patterns are evolving as a resuable solution to the problem that we encounter in our day to day programming
> It is a template or description for how to solve a problem that can be used in many situtions
> these design pattern are developed by some industry experts
> these design pattern are already tested and proven
> these design patterns are easy for unit testing
> design pattern can be also helpful for scalability and maintainablity

design pattern are powerfull tools for software development and we should choose the correct design pattern as per the requirement


> There is very famous book "Gang for Four"
according to this book, they have mention 23 design patterns, and have categorized these design pattern into three main categories
1. creation design pattern
2. structural design pattern
3. behavioral design pattern


# Creation design pattern
> this design pattern deals with the object creation and initialization
> this design pattern gives the program more flexibility in terms of deciding which object need to be created for which class
1. singleton
2. factory
3. abstract factory
etc

# Structural design pattern
this pattern focus on decoupling interface and implementation of the class and object or in simple word we can say these design 
pattern provides better structure for your app
1. Adapter
2. Bridge
etc


# Behavioral design pattern
> this design pattern focus on how your object deal with the communication between the class and object
what kind of behaviour we are expecting from the object
1. chain of responsibilioty
2. interceptor
3. Observer
etc


# Singleton
> this pattern belongs to the creation design pattern
> this pattern is used when we need to make sure only one object or instance of a particular class need to be created, and all
future references to the object refer to the same object



# Factory design pattern
this pattern also belong to creation design pattern
we will take away the responsibility from the main class and hand it over to factory class to produce the object of the
dependent class


# Serialization and Deserilization
Serilization in java is a mechanism of writing the state of an object into a byte-stream
it is mainly used in JPA, Hibernate technologies

the reverse operation of serilization is called deserilization where bytes-stream is converted in object
The serilozation and deserialization process is platform independent, it means you can serilaize an object on one platform and
deserilize it on a different platform

writeObject() - serilization
readObject() - deserlization

Note: we must have to implmenent the Serilizable interface for serializing the object

java.io


# Stream API
Java provides a new additional package in java 8 called java.util.stream
this package consist of classes, interfaces and enum it allow function style operation on the elements

Stream provides following features
1. Stream does not store elements. it simply conveys elements from a source such as a data structure, an array, or an I/O channel through
a pipeline of computational operation
2. stream is functional in nature. operations performed on a stream does not modify its source for example filtering a stream obtained
from a collection produce a new stream without the filtered elements, rather than removing elements from thje siurce collection
3. stream is lazy and evaluates code only when required
4. the elements of a stream are only visible once during the life of a stream like an iterator a new stream must be generated to revisit 
the same elements of the source

# Different operation on streal
> intermediate operation
- map - it is used to return a stream consisting of the results of applying the given function to the element of this stream
- filter - it is used to select elements as per Prediacte passed as argument
- sorted - it is used to sort the stream




