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





