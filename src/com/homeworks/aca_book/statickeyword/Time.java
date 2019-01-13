package com.homeworks.aca_book.statickeyword;

/**
 * Created by home on 10/5/2018.
 */
public class Time {
   static int a = 50;
  static   int b = 10;
    public static void main(String args[]) {
       // a += b--;
        a = a + b--;
        System.out.println(b);
    }
}
