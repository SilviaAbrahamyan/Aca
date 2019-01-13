package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/12/2018.
 */
public class DoSomething {
//    public void go() {
//        System.out.print("A");
//        try {
//            stop();
//        } catch (ArithmeticException e) {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//    }
//
//    public void stop() {
//        System.out.print("E");
//        Object x = null;
//        x.toString();
//        System.out.print("F");
//    }

    public static void main(String[] args) {
        //  new DoSomething().go();

        System.out.print("A");
        try {
            System.out.print("E");
            Object x = null;
            x.toString();
            System.out.print("F");
        } catch (NullPointerException e) {
            System.out.print("B");
            throw new ArithmeticException();

        } finally {

            System.out.print("C");
            throw new ArrayIndexOutOfBoundsException();
        }
      //  System.out.print("D");
    }
}
