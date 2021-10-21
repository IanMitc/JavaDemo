# Encapsulation

> It means hiding your method, variables with the help of access modifiers
> Packages
> Access Modifiers

# Packages
In java, a package is a group of similar type of classes, interface and sub packages
Packages in java can be categorized in two forms
1. built in package
2. user defined packages

there are many built-in packages are available in java for example lang, awt, swing, io, util, sql etc

# Advantages
1. packages are used to categorized the classes and interface so that they can be asily maintained
2. java packages provide access protection
3. java packages removes naming collision

package myPack;

class A{

}

class B{

}


import myPack.*;
import myPack.A;



# Access Modifiers in Java
there are two type of modifiers
1. access modifiers - public, private, default, protected
2. non-access modifiers - abstract, static, final

# Access modifiers
1. private
2. public
3. protected
4. default

private - the access level of a private modifier is only within the class, it cannot be accessed from outside the class
default - the access level of a default modifier is only within the package. It cannot be accessed from outside the package
          if we dont specify any access modifier, it wil be default
protected - the access level of a protected modifier is within the package and outside the package through child class
            if we do not make the child class, it cannot be access from outside the package
public - the access level of a public modifier is everywhere it can be accessed within the class, outside the class, 
         within package and outside the package

Problem
id = should be negative number
name = should be null
pass mark = should be readonly


# Java String
> String is basically an object that represent sequence of char value
> An array of characters works same as java string

char[] ch = { 'h', 'e', 'l', 'l', 'o' }
String str = new String(ch);

or

String str = "Hello";

In java.lang contain a class String which implemnets serilazable, comparable, charSequence interface


# CharSequence interface
The CharSequence interface is used the sequence of characters

String
StringBuffer
StringBuilder

the java string is immutable which means it cannot be changed, whenever we change any string a new instance is created
For mutable Strings we can use StringBuffer and StringBuilder class


# THere are two we can create a string object
1. by using String literal
2. by new keyword


1. string literal
using double quotes we can create string

String str = "Hello";

each time you create a string literal, the JVM check the string constant pool. if the string already exist in the pool
a reference to the ppol instance is returned. if the string doesnot exist in the pool, new string instance is created and placed 
in the pool

# why java uses the concept of String literal|?
- to make java memory efficiet (because no new object are created if it exist already in the string contant pool)

2. by new keyword
String str = new String("Hello")

JVM will create a new string in normal heap memory and the literal hello will be placed in the string constant pool
the variable str will refer to the object in the heap

# String class provides various methods
charAt()
length()
subString()
contains()
join()
equals()
isEmpty()
concat()


# Immutable string in Java
In java string object are immutable - means unchangable or unmodifiable
once string object is created its data or state cannot be changed but we can create a new instance

why string objects are immutable in java
because java uses the concept of string literal
suppose there are 10 reference variable all refer to one object "Hello"
of one reference variable changes the value of the object it will affect to all reference variable
that is why string object are immutable in java

# Compare string

we can compare string in java on the basic of the content and reference

there are 3 ways we can compare string in java
1. using equal() method
2. by using == operator
3. compareTo() method

# by using equal() method
the string class equals() method compares the original content of the string
it compare value of string for equality

boolean equal(other object) // compare the string to the other object
boolean equalsIgnoreCase(other object)  // compare the string to the other string ignoring case


2. by using == operator
the == operator compares references not value

3. using compareTo() method
string class compareTo() method compares values and return an integer that describe if first string is less then equal to
or greater then second string

s1 and s2
s1 == s2  // 0
s1 > s2  // positive
s1 < s2  // negative

# String concatenation
in java concatenation means a new string that is the combination of multiple string

there are 2 ways we can concat string in java
1. using + opeartor
2. using concat() method

1. using + operator
in java string concatenation is implemented through the stringBuilder / strigBuffer class and its append method
string concatenation operator proces a new string by appending the second opearnt into the end of the first operand
the string concatenation operator can concat only string but primitive value also


2. using concat() method
string concat method will concatenate the specific string to the end of current string

public String concat(String other)


# Substring in java
> A substring is a part of string
> java provides a built in method subString() that etract a subString from the given string using index value passed
as an argument


Example:
System.out.println("Original message: "+ message);
        System.out.println("SubString starting from index 7: "+ message.substring(7));
        System.out.println("SubString starting from index  0 to 7: "+ message.substring(0, 7));

        String str = new String("Welcome home");
        System.out.println(str);
        System.out.println(str.substring(8));

# Split() method
split() method of a string class can used to extract a substring from a phrase. it accept argument in the form of 
regular expression


# Java StringBuffer class
In java stringBuyffer class is used to create mutable (changable) String object
it is same as string excpt it is mutable that is it can be changed

# StringBuffer class constructor
StringBuffer() with initial capacity of 16
StringBuffer(String s) - it create an object with specified string
StringBuffer(int capacity) - it create an object with empty string buffer but we can specified capacity as length

# StringBuffer method
append()
insert()
replace()
delete()
reverese()
capacity()
charAt()
length()


# insert()
# dleete()
# replace()
# reverse()
# capacity()

the default capacity of the buffer is 16. if the number of character increase from its current capacity. it increase the 
capacity

(old capacity * 2) + 2

default capacity = 16

(16 * 2) + 2  = 34

0






















