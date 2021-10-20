# Constructor
1. It is a special function which get called whenever we create object of the class
2. Constructor are use to initialize the class variables
3. every class which object we want to create must have a constructor
4. if we dont provide constructor for a class compiler will create a default constructor

# Type of constructor
1. default or parameter less constructor
2. parametrized constructor
3. copy constructor
4. static constructor

# Constructor overloading
to have more then one constructor in a class
we have to differentiate constructors on basic of parameters

1. different number of parameters
2. different type of parameters
3. different order of parameters


# OOPs 4 main pillers
1. Inheritence
2. Polymorphism
3. Abstraction
4. Encapsulation


# Inheritence 

DRY - Dont Repeat yourself

> It is a mechanism of consuming members of one class in another class by eastablishing parent and child 
  relationship between the classes
> it encourages the code reusability
> we have relation between the class using extend keyword

Employee   -> Parent / base / super
FullTimeEmployee -> child / derived / sub

> in inheritence child class can consume members of its parent class as it is the owner of those members
except private members of the parent class
> Parent class constructor must be accessible to the child class otherwise inheritence will not be possible
> in inheritence child class can access parent class members but parent class cannot access any member of the 
  child class

# Advantages
- code resuablity
- reduce error
- reduce time
- more maintable code


# Type of inheritence
1. Simple
2. Multi-Level
3. Hirarchical
4. Multiple
5. Hybrid


# Static

The static keyword in java is used for memory management
we can use static keyword with variable, methods, blocks and nested classes

# static variable
> the static variable can be used to refere to the common property of all objects
> the static variables will get memoery only once. if an object changes the value of the static variable it will retian
  its value

# Static Methods
If we apply a static keyword with any method, it will be know as static method

> A static method belongs to the class rather then the object of a class
> A static method can be invoked without the need for creating an instance of a class
> A static method can access static data member and can change the value of it

# Static block
> it is used to initialize the static data members
> it is executed before the main method at the time of class loading

Note: Static members can only access static members only

# Polymorphism
> This is one of the main piller of OOP
> Poly (many) + Morph (shape)
> this allows you to invoke the derived class method through a base class reference during runtime

# There are types of polymorphism
1. static / compile time
2. dynamic / runtime

Method overloading - static
Method overriding - dynamic

# Method overloading 
> in this case, we define multiple methods with the same name by changing their parameters
> this can be performed either within a class as well as between parent and child class also
> method overloading is all about defining multiple or adding behaviour to a method

Condition for method overloading
1. different number of parameter
2. different type of parameter
3. different order of parameter
4. different return type - NO

# Method Overriding
> Method overriding is used to provide the specific implementation of a method that is already provided by the 
super-class
> method overriding is used for runtime polymorphism
> it is all about changing the behavior
> in this case, we define multiple method with the same name and same parameter
> this can be performed only between parent and child class and never can be done within class






