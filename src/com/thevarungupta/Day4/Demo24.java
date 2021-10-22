package com.thevarungupta.Day4;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Demo24 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(65);
        set.add(21);
        set.add(11);
        set.add(2);
        set.add(15);

        for(int number: set){
            System.out.println(number);
        }

        // pollFirst()
        // PostLast()
        System.out.println("Highest: "+ set.pollLast());
        System.out.println("Lowest: "+ set.pollFirst());



    }
}
