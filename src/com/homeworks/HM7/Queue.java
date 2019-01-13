package com.homeworks.HM7;

/**
 * Created by home on 10/16/2018.
 */
public class Queue {
    private int[] arr;
    private int last = -1;
    private int head = 0;

    public Queue(int size) {
        this.arr = new int[size];
        this.last = size;
        this.head = size ;
    }

    public void add(int value) {
        arr[--last] = value;
    }

    public int peek() {
        return arr[0];
    }

    public int poll() {

        return arr[--head];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return last == 0;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(this.arr);
    }
}
