package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread9 extends Thread
{
    public static void main(String [] args)
    {
        MyThread9 t = new MyThread9();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run()
    {
        System.out.print("Thread ");
    }
}

