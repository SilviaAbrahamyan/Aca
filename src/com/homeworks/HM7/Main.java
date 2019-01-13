package com.homeworks.HM7;

/**
 * Created by home on 10/16/2018.
 */
public class Main {
    public static void main(String... args) {
        Queue1 queue = new Queue1(5);

        while(!queue.isFull()) {
            int value = (int) (Math.random() * 100);
            queue.add(value);
            System.out.println(">>>" + value);
            System.out.println("Queue: " + queue);
        }

        System.out.println("Top element: " + queue.peek());

        while(!queue.isEmpty()) {
            int value = queue.poll();
            System.out.println("<<<" + value);
            System.out.println("Stack: " + queue);
        }
    }
}
