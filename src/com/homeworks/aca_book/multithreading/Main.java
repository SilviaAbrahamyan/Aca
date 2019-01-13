package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 10/29/2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
            }
        };



        new Thread(runnable).start();
        Thread.sleep(10000);
        System.out.println("Main has finished its job");
    }
}
