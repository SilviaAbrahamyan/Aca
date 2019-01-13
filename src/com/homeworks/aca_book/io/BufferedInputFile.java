package com.homeworks.aca_book.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class BufferedInputFile {
    public static String

    read(String filename) throws IOException {
// Reading input by lines:

        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args)
            throws IOException {
        System.out.print(read("BufferedInputFile.java"));
    }
}
