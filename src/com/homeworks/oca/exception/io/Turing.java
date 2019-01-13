package com.homeworks.oca.exception.io;

import java.io.Console;

/**
 * Created by home on 11/13/2018.
 */
public class Turing {
    public static void main(String... robots) {
        Console c = System.console();
        final String response = c.readLine("Are you human?");
        System.err.print(response);
    }
}
