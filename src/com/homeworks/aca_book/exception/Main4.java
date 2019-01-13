package com.homeworks.aca_book.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by home on 10/12/2018.
 */
public class Main4 {

    public static void main(String[] args) {
        safemethod();
    }

    private static void safemethod() {

        try {
            dangerousmethod();
        } catch (Exception e) {
            throw new NumberFormatException();
        }

    }

    private static void dangerousmethod() throws IOException {

    }
}
