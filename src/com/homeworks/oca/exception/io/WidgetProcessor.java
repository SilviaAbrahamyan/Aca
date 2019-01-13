package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class WidgetProcessor {
    public int getWidgetNumber(byte[] data) throws Exception {
        try (InputStream is = new ByteArrayInputStream(data)) {

            if (!is.markSupported()) return -1;
            is.mark(3);
            is.read();
            is.read();
            is.skip(1);
            is.reset();
            return is.read();
        }
    }

    public static void main(String... sprockets) throws Exception {
        final WidgetProcessor p = new WidgetProcessor();
        System.out.print(p.getWidgetNumber(new byte[]{1, 2, 3, 4, 5, 6, 7}));
    }


    public String getNameQuick() throws IOException {

        final BufferedReader r = new BufferedReader(
                new FileReader(""));
        final String name = r.readLine();

        return name;
    }
    public String getNameSafely() throws IOException {
        try(final BufferedReader r = new BufferedReader(
                new FileReader(""))) {
            final String name = r.readLine();

            return name;
        }}
}
