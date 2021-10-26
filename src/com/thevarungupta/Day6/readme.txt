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







