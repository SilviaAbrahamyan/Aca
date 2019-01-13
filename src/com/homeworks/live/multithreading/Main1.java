package com.homeworks.live.multithreading;

/**
 * Created by home on 11/19/2018.
 */
public class Main1 {
    public static void main(String[] args) throws Exception{
        foo("Main thread");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    foo("Thread 1");
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable).start();//բացում է կոդը արանձին ստեկով
        new Thread(runnable).run();//ուղղակի միացնում է կոդը Main կլասի ստեկի մեջ
        foo("Main thread");
    }

    private static void foo(String threadName)throws InterruptedException {
        for(int i = 0;i<10;i++) {
            System.out.println(threadName + " " + i);
            Thread.sleep(1000);
        }
    }
}
