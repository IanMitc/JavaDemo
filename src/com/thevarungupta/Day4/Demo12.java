package com.thevarungupta.Day4;

import java.io.BufferedReader;

public class Demo12 {
    public static void main(String[] args) {

        int a  =10;
        int b = 20;
        int c = 0;

        try{
            c = a / b;
        }catch (ArithmeticException ex){

        }catch (NullPointerException | NumberFormatException e){

        }
        catch (Exception ex){

        }


    }
}
