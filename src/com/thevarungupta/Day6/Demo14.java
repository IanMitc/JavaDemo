package com.thevarungupta.Day6;

class Calculation {
    private static Calculation instance = null;
    public int count = 0;

    private Calculation() {
        count++;
        System.out.println("Count: " + count);
        System.out.println("constructor called");
    }

    public static Calculation getInstance() {
        if (instance == null)
            instance = new Calculation();
        return instance;
    }
}

public class Demo14 {
    public static void main(String[] args) {
        Calculation cal1 = Calculation.getInstance();
        Calculation cal2 = Calculation.getInstance();
        Calculation cal3 = Calculation.getInstance();
    }
}
