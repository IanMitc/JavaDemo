package com.thevarungupta.Day6;

class Engine{
    public Engine(String type){
        System.out.println("Engine created");
    }
}

class Tyre{
    public Tyre(String type){
        System.out.println("Tyre created");
    }
}

class Car{
    Engine engine;
    Tyre tyre;

    public Car(Engine engine, Tyre tyre){
        this.engine = engine;
        this.tyre = tyre;
        System.out.println("Car created");
    }
}


public class Demo16 {
    public static void main(String[] args) {
        //Car car = new Car();
    }
}
