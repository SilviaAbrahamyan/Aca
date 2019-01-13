package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/18/2018.
 */
public class MyThread11 {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable11 m = new MyRunnable11();
        Thread t = new Thread(m, "Thread-1");
        Thread t1 = new Thread(m, "Thread-2");
        t.start();
        Thread.sleep(3000);
        t1.start();
    }
}

class MyRunnable11 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started from run");
        if (Thread.currentThread().getName().equals("Thread-1")) {
            System.out.println(Thread.currentThread().getName() + " Started from run method1");
            method1();
        } else {
            System.out.println(Thread.currentThread().getName() + " Started from run method2");
            method2();
        }
    }

    private synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " Started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Ended");
    }

    private synchronized void method1() {
        System.out.println(Thread.currentThread().getName() + " Started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " Ended");
    }
}