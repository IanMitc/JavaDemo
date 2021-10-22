package com.thevarungupta.Day4;

class EmployeeException extends Exception{

}

public class Demo3 {
    public static void main(String[] args) throws EmployeeException {

//        ArithmeticException ex = new ArithmeticException();
//        throw ex;

        //throw new ArithmeticException();
        throw new EmployeeException();
    }
}
