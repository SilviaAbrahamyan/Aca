package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/1/2018.
 */
public class WaitSyncronization {
    public static void main(String[] args) {
//      WaitSyncronization w = new WaitSyncronization();
//        foo(w);

        foo();
    }
    public static   void foo(WaitSyncronization w){

        try {
            w.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static synchronized   void foo(){

        Class clazz = WaitNotifySyncronization.class;
        clazz.notify();
    }

}
