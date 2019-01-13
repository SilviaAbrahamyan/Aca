package com.homeworks.ivangolovich.spiskiderevo.multithreading;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by home on 11/1/2018.
 */
public class MainHomework {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new PrintRunnable("A .", 100);
        Runnable r2 = new PrintRunnable(". B", 99);
        Runnable r3 = new PrintRunnable("C", 100);
        Runnable runnable = new RunRunnable(r1, r2, r3);
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

        Collection e = new ArrayList();
    }
}

class RunRunnable implements Runnable {

    Runnable r1;
    Runnable r2;
    Runnable r3;

    public RunRunnable(Runnable r1, Runnable r2, Runnable r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread thread1 = new Thread(r1);
                thread1.start();

                Thread thread2 = new Thread(r2);
                thread2.start();

                thread1.join();
                thread2.join();
                System.out.println("-----");

                Thread thread3 = new Thread(r3);
                thread3.start();
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class PrintRunnable implements Runnable {
    String print;
    int wait;

    public PrintRunnable(String print, int wait) {
        this.print = print;
        this.wait = wait;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                System.out.println(print);
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}