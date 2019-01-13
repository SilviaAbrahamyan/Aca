package com.homeworks.ivangolovich.spiskiderevo.exception;

/**
 * Created by home on 11/12/2018.
 */
public class Test1 {
    public static void main(String[] args) {

        try {
            System.out.println(0);
            throw new ArithmeticException();
        }catch (NullPointerException e){
            System.out.println(1);

        }catch (ArithmeticException e){
            System.out.println(2);
            throw  e;
        }
//        finally {
//            System.out.println(3);
//            throw new NullPointerException();
//        }

       // System.out.println(3);
    }
}
