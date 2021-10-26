package com.thevarungupta.Day6;

interface ISayHello{
    String hello();
}

interface ISayHello2{
    String hello(String name);
}

interface ICalculator{
    int addNumber(int a, int b);
}

public class Demo11 {
    public static void main(String[] args) {
        ISayHello s = () -> {
            return "Hello World";
        };
        String result = s.hello();
        System.out.println(result);

        ISayHello2 s2 = (a) -> {
            return "Welcome "+ a;
        };
        System.out.println(s2.hello("Paul"));

        ICalculator calculator = (x, y) -> {
            return x + y;
        };
        System.out.println("Sum : "+ calculator.addNumber(100, 200));
    }
}
