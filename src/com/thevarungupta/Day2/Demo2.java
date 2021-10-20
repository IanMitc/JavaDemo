package com.thevarungupta.Day2;

class Calculator {
    int a = 10;
    int b = 20;

    public Calculator() {
        System.out.println("Parameter less constructor");
    }

    public Calculator(int x, int y) {
        System.out.println("Parameterized constructor");
        this.a = x;
        this.b = y;
    }

    public void addNumber() {
        System.out.println("Sum: " + (a + b));
    }
}


public class Demo2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber();

        Calculator cal2 = new Calculator(100, 200);
        cal2.addNumber();
    }
}
