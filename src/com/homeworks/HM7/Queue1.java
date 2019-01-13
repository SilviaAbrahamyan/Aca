package com.homeworks.HM7;

/**
 * Created by home on 10/17/2018.
 */
public class Queue1 {
    private int[] arr;
    private int last = -1;
    private int head = -1;

    public Queue1(int size) {
        this.arr = new int[size];
    }

    public void add(int value) {
        arr[++last] = value;
    }

    public int peek() {
        return arr[0];
    }

    public int poll() {

        return arr[++head];
    }

    public boolean isEmpty() {
        return head == arr.length-1;
    }

    public boolean isFull() {
        return last == arr.length - 1;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(this.arr);
    }
}
