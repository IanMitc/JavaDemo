package com.thevarungupta.Day2;

interface IEmployee{
    void print();
}

class Z{

}

class Employee1 implements IEmployee{

    @Override
    public void print() {
        System.out.println("interface print method");
    }

    public void test(){

    }
}

public class Demo26 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.print();
        emp.test();

        IEmployee iEmployee = new Employee1();

    }
}
