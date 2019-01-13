package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class InconvenientImplementation {
    public static void main(String... dontDoThis) throws Exception {
        Console c = System.console();
        Writer writer = new BufferedWriter(new FileWriter("C://temp//cake.txt"));
        Reader reader = new BufferedReader(new FileReader("C://temp//cake.txt"));
        if(writer != null) {
            writer.write('f');
            writer.write('f');
            writer.write('g');
            writer.write('s');
            writer.flush(); // t1
            int i;
            StringBuilder sb = new StringBuilder();
            while((i = reader.read()) != 'x') { // t2
                sb.append((char)i);
            }
            c.writer().format("Result: %s",sb.toString());
        }
    }
}
