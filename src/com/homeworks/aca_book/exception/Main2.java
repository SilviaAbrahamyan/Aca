package com.homeworks.aca_book.exception;

import java.io.IOException;
import java.util.IllegalFormatException;

/**
 * Created by home on 10/12/2018.
 */
public class Main2 {
    public static void main(String[] args) {

        try {
            foo(new Exception("dfhgaz"));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        try {
            eatCarrot();
        } catch (IllegalFormatException e ) {// DOES NOT COMPILE if it's checked
            System.out.print("sad rabbit");
        }
    }

    private static void foo(Exception e)throws Throwable{

        throw e;

    }



    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
    private static void eatCarrot() throws IllegalFormatException { }
}

