package com.homeworks.oca.exception.exceptionsAs;

import java.io.IOException;

/**
 * Created by home on 10/24/2018.
 */
public class Light {
    public void turnOn() throws IOException {
        new IOException("Not ready");
    }
    public static void main(String[] j) throws Exception {
        try {
            new Light().turnOn();
        } catch (RuntimeException b) { // y1
            System.out.println(b);
            throw new IOException(); // y2
        } finally {
            System.out.println("com");
        }
    }
}
