package com.thevarungupta.Day6;

class Calculator<T> {
//    public boolean areEqual(int a, int b){
//        if(a == b)
//            return true;
//        else
//            return false;
//    }

    public boolean areEqual(T a, T b) {
        if (a.equals(b))
            return true;
        else
            return false;
    }

}

public class Demo5 {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        boolean result = calculator.areEqual("A", 10);


        Calculator<String> calculator = new Calculator<>();
        boolean result =  calculator.areEqual("A", "A");

        Calculator<Integer> calculator1 = new Calculator<>();
        calculator1.areEqual(10, 20);

        if (result)
            System.out.println("Are equal");
        else
            System.out.println("Not equal");

    }
}
