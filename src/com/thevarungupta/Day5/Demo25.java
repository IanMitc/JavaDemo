package com.thevarungupta.Day5;

public class Demo25 {
    public static void main(String[] args) {
        // converting all primitive type into its wrapper classd
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 12.3f;
        double f = 12.23;
        char g = 'a';
        boolean h = true;

        // Autoboxing: converting primitive into object
        Byte byteObj = a;
        Short shortObj = b;

        // unboxing: converting object into primitive
        byte byteValue = byteObj;
        short shortValue = shortObj;
    }
}
