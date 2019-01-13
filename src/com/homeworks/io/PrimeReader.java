package com.homeworks.io;

import java.io.*;

/**
 * Created by home on 10/27/2018.
 */
public class PrimeReader {
    public static void main(String[] real) throws Exception {
        try (InputStream is = new FileInputStream("C:\\temp\\prime6.txt")) {
            is.skip(1);
            is.read();
            is.skip(1);
            is.read();
            is.mark(4);
            is.skip(1);
            is.reset();
            System.out.print(is.read());
        }
    }

    public void writeSecret1() throws IOException {
        final Writer w = new BufferedWriter(
                new FileWriter("dont.open"));
        w.write("Secret passcode");
        w.close();
    }
    public void writeSecret2() throws IOException {
        try(final Writer w = new BufferedWriter(
                new FileWriter("eqf"))) {
            w.write("Secret passcode");
        }
    }

}
