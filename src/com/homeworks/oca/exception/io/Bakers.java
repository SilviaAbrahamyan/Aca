package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class Bakers {
    public static void main(String... tooMany) throws IOException {
       File cake = new File("C://temp//cake.txt");


        Writer pie = new FileWriter(cake);
         pie.flush();
        new File("C://temp//fudge.txt").mkdirs();
        }
}
