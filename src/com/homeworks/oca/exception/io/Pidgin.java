package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class Pidgin {
    public static void copyPidgin(File s, File t) throws Exception {
        try(InputStream is = new FileInputStream(s);
            OutputStream os = new FileOutputStream(t)) {
            byte[] data = new byte[123];
            int chirps;
            while((chirps = is.read(data))>0) {
                os.write(data);
            }}
    }

    public static void main(String[] args) throws Exception {

        copyPidgin(new File("C://temp//2.txt"), new File("C://temp//1.txt"));
    }
}
