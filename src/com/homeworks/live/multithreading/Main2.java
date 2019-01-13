package com.homeworks.live.multithreading;

/**
 * Created by home on 11/19/2018.
 */
public class Main2 {
    public static void main(String[] args) throws Exception{
        foo("Main thread");
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
        new Thread(runnable).start();//բացում է կոդը արանձին ստեկով

        new Thread(runnable).start();
        new Thread(runnable).start();

        System.out.println("Main finished his work");

    }
    private static void foo(String threadName)throws InterruptedException {
        for(int i = 0;i<10;i++) {
            System.out.println(threadName + " " + i);
            Thread.sleep(1000);
        }
    }

}
