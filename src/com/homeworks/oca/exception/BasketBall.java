package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class BasketBall {
    public static void main(String[] dribble) {
        try {
            System.out.print(1);
            throw new ClassCastException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print(2);
        } catch (Throwable ex) {
            System.out.print(3);
            throw ex;
        } finally {
            System.out.print(4);
        }
        System.out.print(5);
    }
}
