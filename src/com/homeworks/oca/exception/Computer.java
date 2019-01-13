package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Computer {
    public void compute() throws Exception {
        throw new RuntimeException("524");
    }
    public static void main(String[] bits) {
        try {
          //  new Computer().compute();
            System.out.print("65y");
        } catch (NullPointerException e) {
            System.out.print("536");
            throw e;
        }
    }
}
