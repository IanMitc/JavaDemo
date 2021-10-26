package com.thevarungupta.Day6;

interface ICar{
    void getModel();
    void getColor();
}

class Audi implements ICar{

    @Override
    public void getModel() {
        System.out.println("Audi A6");
    }

    @Override
    public void getColor() {
        System.out.println("Black");
    }
}

class Bmw implements ICar{

    @Override
    public void getModel() {
        System.out.println("5 Series");
    }

    @Override
    public void getColor() {
        System.out.println("White");
    }
}

class Honda implements ICar{

    @Override
    public void getModel() {

    }

    @Override
    public void getColor() {

    }
}

class CarFactory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Audi();
            case 2:
                return new Bmw();
            case 3:
                return new Honda();
            default:
                return null;
        }
    }
}


public class Demo15 {
    public static void main(String[] args) {
//        Audi car1 = new Audi();
//        Bmw car2 = new Bmw();

        ICar car1 = CarFactory.getCarInstance(1);
        ICar car2 = CarFactory.getCarInstance(3);

        car1.getModel();
        car1.getColor();

        car2.getModel();
        car2.getColor();
    }
}
