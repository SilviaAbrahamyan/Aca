package com.homeworks.live.collections;

import java.util.Queue;

/**
 * Created by home on 10/16/2018.
 */
public class Main {

    public static void main(String... args) {
        Stack stack = new Stack(5);

        while(!stack.isFull()) {
            int value = (int) (Math.random() * 100);
            stack.push(value);
            System.out.println(">>>" + value);
            System.out.println("Stack: " + stack);
        }

        System.out.println("Top element: " + stack.peek());

        while(!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("<<<" + value);
            System.out.println("Stack: " + stack);
        }
    }
}