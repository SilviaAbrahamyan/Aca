package com.homeworks.oca.exception.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by home on 11/13/2018.
 */
public class Furniture {
    public final static void main(String... inventory) throws Exception {
        Writer w = new FileWriter("C://temp//1.txt");
        try (BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("Blue");
        } finally {
            w.flush();
            w.close();
        }
        System.out.print("Done");
    }
}
