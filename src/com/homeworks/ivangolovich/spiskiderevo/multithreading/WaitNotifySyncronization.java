package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class WaitNotifySyncronization {
    public static void main(String[] args) throws InterruptedException {
      //  1 new Object().wait();
//     2   Object obj = new Object();
//        synchronized (obj){
//            obj.wait();
//        }
//    3    Object obj = new Object();
//        synchronized (obj){
//            Object obj1 = new Object();
//            obj1.wait();
//        }
        Object obj = new Object();
        Object obj1 = new Object();
        synchronized (obj){
            synchronized (obj1){
                obj.notify();
            }
        }

    }
}
