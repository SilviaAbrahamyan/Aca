package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread3 implements Runnable
{
    int x = 0, y = 0;
    int addX() {x++; return x;}
    int addY() {y++; return y;}

    public  void run() {
        for(int i = 0; i < 10; i++)
            System.out.println( Thread.currentThread().getName() + ": " +addX() + " " + addY());
    }

    public static void main(String args[])
    {
        MyThread3 obj1 = new MyThread3();
        MyThread3 obj2 = new MyThread3();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}

