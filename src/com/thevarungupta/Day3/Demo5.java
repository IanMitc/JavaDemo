package com.thevarungupta.Day3;

public class Demo5 {
    public static void main(String[] args) {
        // equal() method compares the two given strings based on the content of the string
        // if any character is not matched it returns false
        // if all character are matched it return true
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Paul";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false

        String s5 = "MARK";
        System.out.println(s1.equals(s5)); // false
        System.out.println(s1.equalsIgnoreCase(s5));  // true

    }
}
