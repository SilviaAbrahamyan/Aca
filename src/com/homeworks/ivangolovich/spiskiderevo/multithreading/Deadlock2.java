package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class Deadlock2 {
    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread = Thread.currentThread();
        Thread runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Run waiting to Main");
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        runThread.start();
        System.out.println("Main waiting to Run");
        mainThread.join();
    }
}
