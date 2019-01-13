package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 10/30/2018.
 */
public class Exercise1 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            Thread.yield();
            System.out.println("Start running" + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Exercise1());
        t.start();
        System.out.println("Main has finished its job");
    }
}
