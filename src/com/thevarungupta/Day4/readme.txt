# Exception
Exceoption is an event which occurs during the execution of a program that cause the application or program to 
terminate inappropriately

We can handle the exception using
1. try
2. catch
3. finally
4. thorw
5. throws

# Type of execption
there are mainly two type of exception are checked and unchecked, however there are some errors which also considered
as unchecked exception
1. check
2. unchecked
3. error

# Check exception
as also know as compile time exception which means these exception we must handle at compile time for ex: IOException,
SQLException

# Unchecked Exception
as know as know runtime exception which means these exception are dangerous and if you have not handled it may causse your
application to terminate inappropriately ex: NullPointerException, ArrayIndexOutBound() unchecked exception are not 
checked at compile time but they are checked at runtime

# Error
errors are irrecoverable eg: OutOfMemoeryError, VirtalMachineError

# try
> any code or statement which we feel is risky or can cause an exception we will write inside the try block

# Catch
> whenever any exception happen it will get the control and you can add any alternative or error handling code in the catch
 block

# finally
> no matter exception happens or not it will give you guarantee to execute the code
> when you want to execute any piece of code even exception happed or not we can write inside the finally block

example: open the connection and we want to make sure connection get closed so we can write connection closing code inside the 
finally block

# throw
it is keyword which is used to explicity throw an exception
we can use throw keyword to either throw check or unchecked exception in java


# Demo - Finally
Case 1: exception doesnt occur
Case 2: exception occurs and not handled
case 3: exception occurs and handle

# throw vs throws
throw
1. java throw keyword is used to explicitly throw an exception
2. checked exception cannot be propogated using throw only
3. it is followed by an instance
4. it is used within the method

throws
1. java throws keyword is used to declare an exception
2. check exception can be propgated with throws
3. it is followed by class
4. it is used with the method signature

# final vs finally vs finalize
1. final
it is used to apply retriction on variable, method and class, final class cann't inherited, final method can't be override,
final variable value cann't be change
final is a keyword

2. finally
it is used to place important code, it will be executed wheather exception is handled or not
finally is a block

3. finalize
it is used to perform clean up just before object is garbage collected
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











