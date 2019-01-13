package com.homeworks.aca_book.multithreading;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by home on 11/17/2018.
 */
public class Task6 implements Runnable {
    Random rand = new Random();
    public void run() {
        try {
            int t = 1000 * rand.nextInt(10);
            TimeUnit.MILLISECONDS.sleep(t);
            System.out.println("Slept " + t/1000 + " seconds");
           // return;
        } catch(InterruptedException e) {
            System.err.println("Interrupted");
        }

    }
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: enter a number");
        }
        if(args.length == 1) {
            int n = Integer.parseInt(args[0]);
            Task6 exec = new Task6();
            for(int i = 0; i < n; i++)
                new Thread(exec).start();
        }
    }
}
