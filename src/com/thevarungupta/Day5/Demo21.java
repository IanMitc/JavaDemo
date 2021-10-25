package com.thevarungupta.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(100); // single character
        fw.write("\n");
        fw.write("Ths is some messageeeeeeeeeee");
        fw.write("\n");
        char[] c1 = { 'h', 'e', 'l', 'l', 'o' };
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
