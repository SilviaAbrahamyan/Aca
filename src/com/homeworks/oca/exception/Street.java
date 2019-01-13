package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Street {
    public static void dancing() throws RuntimeException {
        try {
            throw new IllegalArgumentException();
        } catch (Error e) {
            System.out.print("j");
        }
    }
    public static void main(String... count) throws RuntimeException {
        dancing();
    }
}
