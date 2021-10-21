package com.thevarungupta.Day2;

interface Drawable2{
    void draw();
    static void area(){
        System.out.println("getting area..");
    }
}

class Circle2 implements  Drawable2{

    @Override
    public void draw() {
        System.out.println("drawing...");
    }
}

public class Demo30 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        circle.draw();
        Drawable2.area();
    }
}
