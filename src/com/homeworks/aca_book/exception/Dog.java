package com.homeworks.aca_book.exception;

import java.io.IOException;

/**
 * Created by home on 10/12/2018.
 */
public class Dog {
    public static void main(String[] args) {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt("zeryt");
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        } finally {
            System.out.print("C");
        }

        System.out.print("5");

    }

    public void ohNo() throws NullPointerException {
        throw new IllegalArgumentException();
    }
}
