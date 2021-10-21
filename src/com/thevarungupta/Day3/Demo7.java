package com.thevarungupta.Day3;

public class Demo7 {
    public static void main(String[] args) {
        // compareTo() method return a positive number, negative number or 0
        // if s1 > s2 return positive number
        // if s1 < s2 return negative number
        // if s1==s2 return 0

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";

        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); // -3 because m is 3 times lower then p
        System.out.println(s3.compareTo(s1));  // + because m is 3 times greater then p
    }
}
