package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/17/2018.
 */
public class WaitNotifySyncronization1 {
    public static void main(String[] args) {
        new WaitNotifySyncronization1().foo();;
    }
    public synchronized void foo(){
        this.notify();
    }


}
