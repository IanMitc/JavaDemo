package com.thevarungupta.Day2;

class Bank{
    public int getRateOfInterest(){
        return 2;
    }
}

class BankA extends Bank{
    public int getRateOfInterest(){
        return 5;
    }
}

class BankB extends Bank{
    public int getRateOfInterest(){
        return 6;
    }
}


public class Demo19 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();

        bankA.getRateOfInterest();
        bankB.getRateOfInterest();

        System.out.println(bankA.getRateOfInterest());
        System.out.println(bankB.getRateOfInterest());
    }
}
