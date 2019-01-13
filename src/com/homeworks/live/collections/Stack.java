package com.homeworks.live.collections;

/**
 * Created by home on 10/16/2018.
 */
public class Stack {

    private int[] arr;
    private int top = -1;

    public Stack(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(this.arr);
    }

}
