# Multithreading in Java

It is a process of executing multiple threads simultenously

A thread is a lightweigh sub-process, the smallest unit of processing that has a seprate execution path

Multi-threading and multi-processing are both used to achieve multitasking

# Multi-tasking
> it is a process of executing multiple tasks simultaneously
> We can utlize the CPU to the fullest
> it can be achieved in two ways

1. Process-based multitasking
2. thread based multitasking

# Process based multitasking (Multi-processing)
1. Each process has an address in the memory
2. Each process allocated a seprate memoery area
3. A process as heaveweight
4. cost of communication is high
5. Switching between the process is expensive and time-consuming

# Thread based multitasking (Multi-Threading)
1. Thread share the same address space
2. A thread is lightweight
3. cost of communication is low and time-efficient


# Advantages of multi-threading
1. it doesn't block the user as threads are independent, and you can perform multiple operations at the same time
2. it save time by performing many operation togther
3. thread are independent, so it doesn't affect the other thread if an execution occurs in a single thread

# Java provides thread class to achieve thread programming
thread class provides constructor and method to create and to perform operation on the thread

# How to create a thread
there are two ways to create a thread
1. by extending a class from Thread class
2. by implementing a Runnable interface


Thread class

# Constructor
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r, String name)

# Method of thread class
run()
start()
sleep()
join()
getName()
setName()
setPriority()
getPriority()
stop()
resume()


# Runnable interface
this interface can be implemented by any class whose instance are intended to be executed by a thread
there is only one method in the runnable interface


between both approach implementing the runnable interface is preferred as we can inherit the class with some other
class as well, in java a class can inherit only one class

run() - is used to perform action for a thread
start() - used to start a newly created thread


# Thread Life cycle
there are only four states in the thread life cycle in java, but there is one more we can add, so togther, there are
five states

1. New
2. Runnable
3. Running
4. Non-Runnable (blocked)
5. Terminated

JVM controls the life cycle of the thread in java

1. new - it is the new state if you create an instance of thread class but before start() method called
2. runnable - thread is in runnable state after the invocation of start() methd and waiting for its turn 
3. running - the thread is in running state when run() is executing
4. terminated - after completing the task or dead state, whe run() exit the execution
5. non-runnable - still alve but not eligible to run, migh be blocked for any reason


# What is thread schedular in java
Thread schedular is the part of JVM that decide which thread should be run, but there is no guarantee
that which runnbale thread will be chosen to run by the thread schedular only one thread at a time can be run
in a single process, it mainly uses time slicing scheduling to schedule the thread

t1 ---------
t2 ----------
t3 ---------

# Sleep()
the sleep() method of the thread class us used to sleep for a specific amount of time


# What will happen if i directly call run() instead of start()
Each thread start in a separate call stack
invoking the run() method from the main thread, the run() method goes into the current call stack rather then
at the begining of a new stack

we can call the run() method directly, but there wil be no context switching and t1 and t2 will be treated as
normal object, not a thread class object


# Naming thread
getName() - find the name of the thread
setName(name) - use to change the name of the thread
getCurrentThread() - return the information of the curent thread


# Priority of a thread
Each thread can have their priority
and this priority is represented by a number between 1 to 10
most of the cases thread schedular schedule the thread according to their priority
but is not guaranteed bcoz it depends upon JVM specification

MIN_PRIORITY
MAX_PRIORITY
NORM_PRIORITY

# Join()
Join method wat for a thread to die
current running thread to stop execution untill the thread it joins will complete its task


# Thread Pool
A thread pool represent a group of workers thread waiting for the job and reusing many times
In the case of thread pool group of fixed size threads are created 
A thread from the thread pool is pulled out and assigned a job by service provider
after completion of the job thread is cointained in the thread pool again

# Advantage thread pool
Better performance: it save time because there is no need to create a new thread

# Synchorinization
Ot is a capability to control the access of multiple threads to any share resources
it gives us a better option where we wabt to allow only one thread to access the shared resouces


# Why use synchronization
1. to prevent thread interfarence
2. to prevent the consistent problem


# Type of synchronization 
1. process
2. thread

# Concept of Lock
Synchronization is built around an internal entity knows as lock or monitor
every object has a lock associated with it
every thread that needs consistent access to an object has to acquire the lock before access them
and then release the lock when it is done


# Synchronized block in java
snchorized block can be perform synchronization on any specific resource of the method
for example we have 100 lines of code in our method, but we want to synchronized only 10 line of code

> Synchronized block is used to lock an object for any resouces
> scope of the synchronization block is smaller then the method

# inter thread commnucation
it all about cooperation or allowing the synchronized thread to communicate with each other
wait() - current thread to realease the lock and wait until either another thread invokes notify
notify() - sending a notification to the waiting thread
notiffyAll()

# Deadlock in java
Deadlock in java is a part of multi-threading
deadlock can occur in a situation when a thread is waiting for an object lock that is aquired by another thread
and second thread is waiting for an object lock that is acquired by the first thread
since both thread are waiting for each other to release the lock this condition is called deadlock


# Java I/O (Input and Output)
We can perform file handling task in java using I/O API

File file = new File("data.txt")
this line will not create an physical file
it will first check any file with this name available or not
if it is available then it will refer to that file
if not then we just creating java file object to represent data.txt


file.exists()
return boolean value
true - file exist
false - file does not exsits

file.createNewFile()

In UNix everything is a file
every directory are also known as file
java file system based on UNIX
file class can be use to work with either file or directory

file.mkdir() this msthod can be use to create a directory


# File
Contructor 1:
File file = new File(String name)
name can be either file or directory name
file will get created in the current directory



Constructor 2:
File file = new File(String subDirectoryName, String fileName)
subdirectory is your desire location
this directry can be present in some other location


Constructor 3:
File file = new File(File subDirectory, String name)


# File
exists() - to check file
createNewFile()
mkDir()
isFile() - check we have file or not
isDirectory()
list()
length()
delete()












