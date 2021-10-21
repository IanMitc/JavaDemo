package com.thevarungupta.Day2;

interface X2 {
    void print();

    interface Y2 {
        void display();

        interface G2 {
            void foo();
        }

    }

}

class Z2 implements X2, X2.Y2, X2.Y2.G2 {

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }

    @Override
    public void foo() {

    }
}

public class Demo31 {
    public static void main(String[] args) {

    }
}
