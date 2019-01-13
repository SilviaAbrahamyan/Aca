package com.homeworks.aca_book;

/**
 * Created by home on 10/12/2018.
 */
public class Main3 {
    public static void main(String[] args) {
        foo();
    }

    private static void foo(){

        for(int i =10; i>= -10; i--){
            try {
                System.out.println("i" + " " + i);
                int x = 100/i;
                System.out.println(x);
            }catch (Exception e){
                System.out.println("Exception");
               // break;
            }finally {
                System.out.println("finally");
               // continue;
            }

        }
    }
}
