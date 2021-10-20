package com.thevarungupta.Day2;

abstract class Calculator3 {
    // non abstract method
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
    }

    // abstract method
    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
}

class Output extends Calculator3 {

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: " + (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: " + (num1 / num2));
    }
}

public class Demo23 {
    public static void main(String[] args) {
        Output obj = new Output();
        obj.addNumber(200, 100);
        obj.subNumber(200, 100);
        obj.mulNumber(200, 100);
        obj.divNumber(200, 100);


    }
}
