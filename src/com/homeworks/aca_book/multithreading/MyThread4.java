package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread4 {
    public static void main(String [] args)
    {
        System.out.print("1 ");
        synchronized(args)
        {
            System.out.print("2 ");
            try
            {
                args.wait(); /* Line 11 */
            }
            catch(InterruptedException e){ }
        }
        System.out.print("3 ");
    }
}
