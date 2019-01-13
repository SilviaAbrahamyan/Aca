package com.homeworks.live.multithreading;

/**
 * Created by home on 11/19/2018.
 */
public class Main5 {
    private  int x = 1;

    public static void main(String[] args) throws Exception {
        Main5 m = new Main5();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    m.x++;
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(m.x);

    }

}
