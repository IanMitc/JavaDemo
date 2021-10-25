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









