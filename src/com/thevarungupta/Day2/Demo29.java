package com.thevarungupta.Day2;

interface Drawable{
    void draw();

    default void print(){
        System.out.println("print...");
    }
}

class Rect implements Drawable{

    @Override
    public void draw() {
        System.out.println("drawing..");
    }
}

public class Demo29 {
    public static void main(String[] args) {
        Rect rec = new Rect();
        rec.print();
        rec.draw();
    }
}
