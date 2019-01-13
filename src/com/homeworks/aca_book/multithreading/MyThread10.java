package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 11/18/2018.
 */
public class MyThread10 implements Runnable{

    Thread10 thread10;

    void method1(){
        thread10 = new Thread10();
        new Thread(new MyThread10()).start();
        new Thread(new MyThread10()).start();
    }


    @Override
    public void run() {
        thread10.method(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new MyThread10().method1();
    }
}

class Thread10{
    void method(String name){
        for (int i =1; i<=2; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}