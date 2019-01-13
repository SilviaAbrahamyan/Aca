package com.homeworks.aca_book.exception;

import java.io.IOException;

/**
 * Created by home on 10/12/2018.
 */
public class Main {
    public static void main(String[] args) {

        try {
            eatCarrot();
        } catch (Exception e ) {// DOES NOT COMPILE
            System.out.print("sad rabbit");
        }

    }


    static void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cTCH@");
        } catch (Exception e) {
            System.out.println("catch1");
        }
    }

    private static void eatCarrot() {
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    static void fall() throws IOException {

        System.out.println("it's ok");
    }

}





class NoMoreCarrotsException extends Exception {
}


