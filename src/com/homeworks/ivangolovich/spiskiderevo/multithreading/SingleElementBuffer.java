package com.homeworks.ivangolovich.spiskiderevo.multithreading;

/**
 * Created by home on 11/1/2018.
 */
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem!= null){
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null){
            this.wait();
        }
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
