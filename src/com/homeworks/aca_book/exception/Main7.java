package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Main7 {
    public static void main(String args[]) {
        Main7 var = new Main7();
        var.print(args);
    }
    void print(String[] arr) {
        try {
            System.out.println(arr[0] + ":" + arr[1]);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
