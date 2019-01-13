package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/12/2018.
 */
public class Main6 {
    public static void main(String args[]) {
        Main6 var = new Main6();
        var.print(args);
    }
    void print(String[] arr) {
        try {
            System.out.println(arr[0] + ":" + arr[1]);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
    }
}
