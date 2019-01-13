package com.homeworks.aca_book.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by home on 11/17/2018.
 */
public class SleepingTask extends LiftOff {
    public void run() {

        try {
            while(countDown-- > 0) {
                System.out.print(status());
// Old-style:
// Thread.sleep(100);
// Java SE5/6-style:
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
    public static void main(String[] args) {
        SleepingTask exec = new SleepingTask();
        for(int i = 0; i < 5; i++)
          new Thread(exec).start();

    }
}
