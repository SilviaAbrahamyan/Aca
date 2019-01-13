package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread extends Thread
{
    MyThread()
    {
        System.out.print(" MyThread");
    }
    public void run()
    {
        System.out.print(" bar");
    }
    public void run(String s)
    {
        System.out.println(" baz");
    }
}
 class ThreadDemo2
{
    public static void main (String [] args)
    {
        Thread t = new MyThread()
        {
            public void run()
            {
                System.out.println(" foo");
            }
        };
        t.start();
    }
}