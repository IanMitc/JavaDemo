package com.thevarungupta.Day2;

class Car2{
    public final int speedLimit = 60;

    public void drive(){
        //speedLimit = 80;
        System.out.println("car is driving at speed of "+ speedLimit);
    }

}

public class Demo20 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        //.speedLimit = 90;
        car.drive();
    }
}
