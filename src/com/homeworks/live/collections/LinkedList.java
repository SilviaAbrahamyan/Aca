package com.homeworks.live.collections;

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
       // private byte[] balast = new byte[10 * 1024 * 1024];

        private Node(int value) {
            this.value = value;
        }

        @Override
        public void finalize() {
            System.out.println("GC collected [" + value + "]");
        }
    }
}
