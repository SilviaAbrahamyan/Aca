package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class IntteruptedExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.interrupted());
                    for (long k = 0; k < 1_000_000_000L; k++) ;


                }
            }
        });

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
