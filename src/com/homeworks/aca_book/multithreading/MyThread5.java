package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread5 implements Runnable {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        MyThread5 obj = new MyThread5();
        (new Thread(obj)).start(); /*Line 8*/
        (new Thread(obj)).start(); /*Line 8*/
    }

    public synchronized   void run() /*Line 11*/ {
        for (int i = 0; i < 10; i++) /*Line 13*/ {
            x++;
            y++;

            System.out.println("Thread name"+ Thread.currentThread().getName() +"x = " + x + " ; y = " + y);
        }
    }
}
