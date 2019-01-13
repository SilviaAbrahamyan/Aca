package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread2 extends Thread
{
    MyThread2() {
        synchronized (this){

        }
    }
    MyThread2(Runnable r) {super(r); }
    public void run()
    {
        System.out.println("Inside Thread ");
    }
}
class RunnableDemo implements Runnable
{
    public void run()
    {
        System.out.println("Inside Runnable");
    }
}
class ThreadDemo
{
    public static void main(String[] args)
    {
        new MyThread2().start();
        new MyThread2(new RunnableDemo()).start();
        new Thread(new RunnableDemo()).start();
    }
}
