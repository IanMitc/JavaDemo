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













