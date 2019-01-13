package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/3/2018.
 */
public class StackOverflowErrorExample {
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        StackOverflowErrorExample.recursivePrint(1);
    }
}
