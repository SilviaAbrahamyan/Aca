package com.homeworks.aca_book.exception;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.IOException;
import java.util.IllegalFormatException;

/**
 * Created by home on 10/12/2018.
 */
public class Main1 {
    static String s = "";

    public static void main(String[] args) {
        s = s+1;
        foo3();
        System.out.println(s);
    }

    static void foo5() {
        s = s+5;
        throw new ArithmeticException();
    }

    static void foo4() {
        try {
            s = s+4;
            foo5();
        } catch (NumberFormatException e) {
            s = s+3;
        } catch (Exception e) {
            s = s+0;
        }

    }

    static void foo3() {
        try {

            s = s+2;
            foo4();
        } catch (ArithmeticException e) {
            s = s+6;
        }

    }
}


