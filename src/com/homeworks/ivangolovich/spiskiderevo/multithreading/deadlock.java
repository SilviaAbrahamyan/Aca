package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/1/2018.
 */
public class deadlock {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();

        Thread t = new Thread().currentThread();
        t.join();

        new Object().notify();
        Object ref = new Object();
        synchronized (ref){
            ref.notify();
        }
    }
}
