package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class MyThread8 extends Thread {
    public static void main(String[] args) {
        MyThread8 t = new MyThread8(); /* Line 5 */
        t.run();  /* Line 6 */
    }

    public void run() {
        for (int i = 1; i < 3; ++i) {
            System.out.print(i + "..");
        }
    }
}
