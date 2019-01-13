package com.homeworks.oca.exception.exceptionsAs;

import java.io.Closeable;

/**
 * Created by home on 10/24/2018.
 */
public class PrintCompany {
    class Printer implements Closeable { // r1
        public void print() {
            System.out.println("Thus is");
        }
        public void close() {}
    }
    public void printHeadlines() {
        try (Printer p = new Printer()) { // r2
            p.print();
        }
    }
    public static void main(String[] headlines) {
        new PrintCompany().printHeadlines(); // r3
    }
}
