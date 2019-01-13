package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/1/2018.
 */
public class Deadlock1 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = new Thread().currentThread();
        Thread runThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("Run: wait for main");
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        runThread.start();
        System.out.println("Main: wait for run");
        runThread.join();
    }
}
