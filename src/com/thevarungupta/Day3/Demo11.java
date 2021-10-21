package com.thevarungupta.Day3;

import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
        String message =  "mark@gmail.com";
        // 91-999999
       //String message = "Hello, Welcome to Java";
        String[] result = message.split("@");
        System.out.println(Arrays.toString(result));

    }
}
