package com.thevarungupta.Day2;

class A1{
    public void test1(){

    }
}

class B1 extends A1{
    public void test2(){

    }
}

class C1 extends A1{
    public void test3(){

    }
}

public class Demo8 {
    public static void main(String[] args) {
        B1 b = new B1();
        b.test1();
        b.test2();

        C1 c = new C1();
        c.test1();
        c.test3();
    }
}
