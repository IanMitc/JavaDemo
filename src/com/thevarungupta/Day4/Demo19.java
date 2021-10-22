package com.thevarungupta.Day4;

import java.util.ArrayList;

public class Demo19 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("John");
        names.add("Watson");

        System.out.println(names);

        // getting element on a specified index
        System.out.println(names.get(1));

        // adding the element on a specific index
        names.add(1, "Rangel");
        System.out.println(names);

        // merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Smith");
        newNames.add("Stacy");
        //names.addAll(newNames);

        // adding second list element to the specified position
        names.addAll(0, newNames);
        System.out.println(names);

        // remove
        names.remove("Mark");
        System.out.println(names);

        // remove
        names.remove(0);
        System.out.println(names);

        // removing an element based on condition
        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);

    }
}
