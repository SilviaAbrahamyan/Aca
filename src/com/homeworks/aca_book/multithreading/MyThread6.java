package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread6 implements Runnable {
    String x, y;

    public void run() {
        for (int i = 0; i < 10; i++)
            synchronized (this) {
                x = "Hello";
                y = "Java";
                System.out.println("Thread name"+ Thread.currentThread().getName() + x + " " + y + " ");
            }
    }

    public static void main(String args[]) {
        MyThread6 run = new MyThread6();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }
}
