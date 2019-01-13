package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread1 {
    public static void main(String[] args) {


            ThreadTest t1 = new ThreadTest();
            ThreadDemo1 t2 = new ThreadDemo1();
            t1.start();
            t2.start();

    }
}

class ThreadTest extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("A");
            System.out.println("B");
        }
    }
}
class ThreadDemo1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("C");
            System.out.println("D");
        }
    }
}