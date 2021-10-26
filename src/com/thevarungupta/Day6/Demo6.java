package com.thevarungupta.Day6;

class MyClass<T>{
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return obj;
    }
}


public class Demo6 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.obj = "Hello";
        myClass.add("World");
        String a =  myClass.get();
        System.out.println(a);
    }

}
