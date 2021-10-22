package com.thevarungupta.Day4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Demo25 {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Mark");
        deque.add("Paul");

        for(String name: deque){
            System.out.println(name);
        }

    }
}
