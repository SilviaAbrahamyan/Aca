package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Main31 {
    public static void main(String[] pondInfo) {
//        try {
//           int x = 3/0;
//        }catch (ArithmeticException e){
//            throw new ArrayIndexOutOfBoundsException();
//        }finally {
//            throw new NullPointerException();
//        }


        final Object exception = new Exception();
        final Exception data = (RuntimeException)exception;
        System.out.print(data);
    }
}
