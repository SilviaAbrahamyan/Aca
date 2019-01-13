package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/1/2018.
 */
public class ThreadA {public static void main(String[] args){
    ThreadB b = new ThreadB();
    b.start();


        try{
            System.out.println("Waiting for b to complete...");
            b.wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Total is: " + b.total);
    }

}

class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
           notify();
        }
    }
}