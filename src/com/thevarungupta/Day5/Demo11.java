package com.thevarungupta.Day5;

class Table2{
    public void printTable(int number){
        // synchronized block
        synchronized (this){
            for(int i=1;i<=10;i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(number * i);
            }
        }
    }
}

class MyThread11 extends Thread{
    Table2 table;
    public MyThread11(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread12 extends Thread{
    Table2 table;
    public MyThread12(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(100);
    }
}


public class Demo11 {
    public static void main(String[] args) {
        Table2 table = new Table2();
        MyThread11 t1 = new MyThread11(table);
        MyThread12 t2 = new MyThread12(table);

        t1.start();
        t2.start();
    }
}
