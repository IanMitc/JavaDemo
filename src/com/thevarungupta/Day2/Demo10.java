package com.thevarungupta.Day2;

class Student{
    public int rollNumber;
    public String name;
    static public String SchoolName = "ABC School";
}

public class Demo10{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Mark";

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Paul";
    }
}
