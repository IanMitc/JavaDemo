package com.thevarungupta.Day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo18 {
    public static void main(String[] args) {
        // creating stream to read the object
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("cust.txt"));
            Customer customer = (Customer) in.readObject();
            // print the data of the serilized object
            System.out.println("Customer: Id = " + customer.id + ", Name = " + customer.name + ", Email = " + customer.email);
            // closing the stream
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
