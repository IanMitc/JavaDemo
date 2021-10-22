# Exception
An exception is an event that occurs during the execution of a program that causes the application or program to 
terminate inappropriately

We can handle the exception using
1. try
2. catch
3. finally
4. throw
5. throws

# Type of exception
there are mainly two types of exceptions that are checked and unchecked. However, there are some errors which also considered
as unchecked exception
1. check
2. unchecked
3. error

# Check exception
as also known as the compile-time exception, which means these exceptions we must handle at compile time for ex: IOException,
SQLException

# Unchecked Exception
as know runtime exception, which means these exceptions are dangerous, and if you have not handled it may cause your
application to terminate inappropriately ex: NullPointerException, ArrayIndexOutBound() unchecked exception are not 
checked at compile-time, but they are checked at runtime

# Error
errors are irrecoverable eg: OutOfMemoeryError, VirtalMachineError

# try
> any code or statement which we feel is risky or can cause an exception we will write inside the try block

# Catch
> whenever any exception happens, it will get the control, and you can add any alternative or error handling code in the catch
 block

# finally
> no matter exception happens or not, it will give you a guarantee to execute the code
> when you want to execute any piece of code, even exception happed or not, we can write inside the final block

example: open the connection, and we want to make sure the connection gets closed so we can write connection closing code inside the 
finally, block

# throw
it is a keyword that is used to throw an exception explicitly
we can use throw keyword to either throw check or unchecked exception in java


# Demo - Finally
Case 1: exception doesn't occur
Case 2: exception occurs and not handled
case 3: exception occurs and handle

# throw vs. throws
throw
1. java throw keyword is used to throw an exception explicitly
2. checked exception cannot be propagated using throw only
3. it is followed by an instance
4. it is used within the method

throws
1. java throws keyword is used to declare an exception
2. check exception can be propagated with throws
3. it is followed by class
4. it is used with the method signature

# final vs. finally vs. finalize
1. final
it is used to apply restrictions on variable, method, and class; final class can't be inherited, final method can't be overridden,
the final variable value can't be changed
final is a keyword

2. finally
it is used to place important code, and it will be executed whether an exception is handled or not
finally is a block

3. finalize
it is used to perform clean up just before an object is garbage collected
finalize is method


# Top 10 exception
1. NullPointerException()
2. ArrayIndexOutOfBoundException()
3. StackOverFlowException()
4. ClassCastException()
5. IllegalArgumentException()
6. NumberFormatException()
7. IllegalStateException()
8. NoClassDefFiundException()
9. AssertException()
10. ArithmaticException()


# Java Collections

# Collection in Java
> It is a framework that provides an architecture to store and manipulate a group of objects.
> It can achieve all the operation that you can perform on a data set, such as sorting, seraching, inserting, deleting etc

Java Collection framework provides many interface and classes

Interface
> Set
> List
> Queue
> Deque

Class
> ArrayList
> Vectore
> LinkedList
> HashSet
etc


# Why is is a framework
> it provides readymade architecture
> it represent a set of classes and interface

# Hierarchy of collection framework

# Iterator interface
It is the root interface for all collection classes
It provides the facility of iterating the elements in a forward direction only
> hasNext() - it will return true if the iterator has more element; otherwise it return false
> next() - it will return the element and move the cursor pointing to the next element
> remove() - it removes the last element returned by the iterator


# Collection interface
It is the interface that is implemented by the all the classes in the collection framework.
It declared the methods that every collection will have
It is responsable for building the foundation on which the collection framework depends
> add
> addAll()
> clear() etc

# List interface
List interface is the child interface of collection interface
it provides a list type data structure in which we can store the orderded collection of the object
it can have duplicate values

The class implements a list interface
1. ArrayList
2. LinkedList
3. Vector
4. Stack

java.util - package


# ArrayList
> ArrayList clases use a dynamic array for storing the elements
> it is like an array, but there is no size limit
> we can add or remove the elements anytime
> it can have duplicate values
> it implements list interface
> it maintain the insertion order internally
> it is non- synchronized
> it allows random access beacuse the arrayu work at the index number
> manipulation is a little slower then LinkedList beacuse a lot of shifting needs to occur if any element us removed 
from the ArrayList


# Constructor
ArrayList()
ArrayList(int capacity)
ArrayList(collection)

# Method


Java Collection framework was non generic before 1.5
java new generic collection allows us to have one type of object in a collection - type safe


ArrayList list = new ArrayList();

ArrayList<String> list = new ArrayList<String>()

["mark", "paul", "john"]

add()

iterating Arraylist using iterator

foreach()

get and set the element of the arraylist
get() - return the element at the specified index
set() - to chnage the value at a specified index


Sort()

In java.util package, we have a class called collection, which has the static method sort()
we can use this method to perform sorting of the elements in the ArrayList


# iterator interface
# for-each
# for loop
# forEach


// iterator
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // for-each
        System.out.println("------------");
        for(String name: names){
            System.out.println(name);
        }

        // for
        System.out.println("------------");
        for(int i=0;i<names.size(); i++){
            System.out.println(names.get(i));
        }

        // foreach
        System.out.println("------------");
        names.forEach(name -> {
            System.out.println(name);
        });



add()
remove()
removeIf()
etc


# LinkedList
LinkedList class uses a doubly linked list to store the element
it provides a linked-list data structure, and it inherits the abstractList class and implments the list and
deque interface
> LinkedList class can contain the duplicate element
> LinkedList class maintain insertion order
> LinkedList class is non-synchronized
> In LinkedList manipulation is fast because no shifting needs to occur
> LinkedList class can be used as a list, stack or queue


doubley linked list - we can add or remove the element from both side

# ArrayList vs LinkedList
1. ArrayLiost iternally uses a dynamic array to store the element
Linked list internally uses a doubly linked list to store the element

2. manipulation is slow as shifting occurs
manipulation is fast as no shifting require

3. better for sorting and accessing data
better for manipulating data

4. ArrayLisy class can act as a list only
LinkedList can act as list and queue both



# Set
> HashSet
> LinkedHashSet
> TreeSet

# HashSet
> It is a class used to create a collection that uses a hash table for storage
> it inherit the AbstractSet class and implment the Set interface

> HashSet stores the elements by using a hashing mechanism
> it contain unique elements only
> It allows null value
> it is non-synchronized
> it does not maintain the insertion order because the elements are inserted on the basics of thir hashCode
> it is best for the search operation


# List vs Set
1. List can contain duplicate elements where as Set has unique elements only

# LinkedHashSet
> It herits hashSet class and implment set interface

> LinkedHashSet class contain unique elements only like HashSet
> it provides all optional set opeartion and permits null element
> it is non-synchronized
> it maintains insertion order


# TreeSet
The TreeSet class implments the Set interface that uses a tree for storage
It inherit Abstract class and implments the Navigatable Set interface
The object of the TreeSet class are stored in ascending order

> It contains unique elements only like HashSet
> It provides access and retival time are faster
> It does not allow null element
> it is non-synchronized
> it maintains acsending order


# Deque interface
It is an interface which is a linear collection that support elements insertion and removal at both side
Deque is an acronym "double ended queue"

# ArrayDeque
It provides the facility of using deque and resizable array
it inherit from AbstractCollection class and implmenents the deque interface

> unlike queue we can add or remove elements from the both side
> null element are not allowed
> it is not thread safe
> it has no capacity restriction
> it is faster then linkedlist and stack

add()  -it is used to insert the specified element into deque and return true when sucess
offer() - it is usewd to insert the specified element into the deque


# Queue interface
> It order the element in FIFO manner (First in First Out)
> first element is removed first and last element is removed at last

# PriorityQueue
this is a class which provide the facility of using queue
but it doe nor orders the elemeent in FIFO manner
inherits from AbstarctQueue class

Method
add() - insert element
remove() - used to retrive and removes the head of the queue
poll() - it is used to retrive and remove the head of the queu or return null if this queue is empty
element() - it is used to retrive but doesnot remove the head
peek() - it is used to retiev but does not remove head of this queue or retuun null






















