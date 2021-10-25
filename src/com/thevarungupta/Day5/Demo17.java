package com.thevarungupta.Day5;

import java.io.File;
import java.io.IOException;

public class Demo17 {
    public static void main(String[] args) {
        File dir = new File("db2");
        dir.mkdir();
        File file = new File("db2", "second.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
