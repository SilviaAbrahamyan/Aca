package com.homeworks.ivangolovich.spiskiderevo;

/**
 * Created by home on 10/17/2018.
 */
public class LinkedList {
    private Node root;
    private Node last;

    private int size = 0;

    public void add(int value) {
        if(root == null) {
            root = last = new Node(value);
        }else {
            last.next = new Node(value);
            last = last.next;
        }
        size++;
    }

    public int get(int index) {
        return getNode(index).value;
    }

    public void insert(int index, int value) {
        Node previous = getNode(index - 1);
        Node newNode = new Node(value);
        newNode.next = previous.next;
        previous.next = newNode;
        size++;
    }

    public void remove(int index) {
        Node previous = getNode(index - 1);
        previous.next = previous.next.next;
        size--;
    }
    public int sizeIterative() {
        Node tail = root;
        int size = 1;
        while (tail.next!= null){
            size++;
            tail = tail.next;
        }
        return size;
    }
    public int sumIterative() {
        Node tail = root;
        int sum = tail.value;
        while (tail.next!= null){
            tail = tail.next;
            sum += tail.value;
        }
        return sum;
    }
    public int maxIterative() {
        Node tail = root;
        int max = tail.value;
        while (tail.next!= null){
            if(max <tail.next.value){
                max = tail.next.value;
            }
            tail = tail.next;
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node p = root;
        while(p != null) {
            sb.append(p.value);
            if(p.next != null) {
                sb.append(",");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private Node getNode(int index) {
        Node p = root;
        for(int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public void finalize() {
            System.out.println("GC collected [" + value + "]");
        }
    }
}
