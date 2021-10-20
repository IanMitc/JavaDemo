package com.thevarungupta.Day2;

class Employee2{
    public int empId;
    public String name;
    public static String companyName = "Revature";

    public Employee2(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Id: "+ empId+ ", Name: "+ name+ ", Company Name: "+ companyName);
    }
}

public class Demo13 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Mark");
        Employee2 emp2 = new Employee2(2, "Paul");
        emp1.printInfo();
        emp2.printInfo();
        Employee2.companyName = "ABC";
        emp1.printInfo();
        emp2.printInfo();
    }
}
