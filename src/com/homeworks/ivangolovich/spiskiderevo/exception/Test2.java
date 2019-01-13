package com.homeworks.ivangolovich.spiskiderevo.exception;

import java.io.IOException;
import java.util.IllegalFormatException;

/**
 * Created by home on 11/12/2018.
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        foo4();
    }

    static void foo() {
//        try {
//            System.out.println(0);
//            throw new RuntimeException();
//        } catch (RuntimeException e) {
//            System.out.println(1);
//            throw new NullPointerException();
//        } finally {
//            System.out.println(2);
//
//        }
//        System.out.println(3);
    }

    static void foo1() {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(1);

        } finally {
            System.out.println(2);
            if (true)
                throw new NullPointerException();
        }
        System.out.println(3);
    }

    static int foo2() {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);

            throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.println(11);
        } finally {
            return 2;
        }


        //System.out.println(3);
    }

    static int foo3() {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
            return 2;
        } finally {
            System.out.println(3);
            return 9;
        }
    }

    static void foo4() throws Exception {


            throw new IOException();




        }

}

