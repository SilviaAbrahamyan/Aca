package com.homeworks.live.multithreading;

/**
 * Created by home on 11/19/2018.
 */
public class Main3 {
    public static void main(String[] args) throws Exception{
        foo("Main thread");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting");
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();
        System.out.println("Main finished his work");

    }
    private static void foo(String threadName)throws InterruptedException {
        for(int i = 0;i<10;i++) {
            System.out.println(threadName + " " + i);
            Thread.sleep(1000);
        }
    }

}
