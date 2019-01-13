package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class Unicorn {
    public void findUnicorns() {
        try(InputStream o = new ObjectInputStream(readBook())) {
            while(o.read() != -1) {
                System.out.println(o.read());
            }
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
    private InputStream readBook() throws IOException {
       // return new BufferedInputStream(new FileReader("C://temp//1.txt"));
        return null;
    }
    public static void main(String... horn) {
        new Unicorn().findUnicorns();
    }
}
