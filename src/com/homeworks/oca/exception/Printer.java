package com.homeworks.oca.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by home on 10/23/2018.
 */
public class Printer {
    public void print() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException enfe) {
            System.out.print("1");
        } catch (IOException exception) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
    }
    public static void main(String... ink) {
        new Printer().print();
    }
}
