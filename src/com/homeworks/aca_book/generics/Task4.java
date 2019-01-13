package com.homeworks.aca_book.generics;

import com.homeworks.aca_book.nested.newNested.Task2Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/15/2018.
 */
public class Task4<T> {
//    private T[] items;
//
//    private int next = 0;
//    public Task4(int size) { items = new T[size]; }
//    public void add(T x) {
//        if(next < items.length)
//            items[next++] = x;
//    }
//    private class SequenceSelector implements Selector {
//        private int i = 0;
//        public boolean end() { return i == items.length; }
//        public Object current() { return items[i]; }
//        public void next() { if(i < items.length) i++; }
//        private T createOuter(){
//            return T.this;
//        }
//    }
//    public Selector selector() {
//        return new SequenceSelector();
//    }
//    public static void main(String[] args) {
//        Task4 sequence = new Task4(10).new SequenceSelector().createOuter();
//        for(int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//        while(!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
//        }
//    }
}

class GenericSequence<E> {
    private List<E> list = new ArrayList<E>();
    private int next = 0;
    public GenericSequence(List<E> list) { this.list = list; }
    public void add(E e) { list.add(e); }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == list.size(); }
        public Object current() { return list.get(i); }
        public void next() { if(i < list.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        GenericSequence<String> gs = new GenericSequence<String>(ls);
        for(int i = 0; i < 10; i++)
            gs.add(Integer.toString(i));
        Selector selector = gs.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
interface Selector {
    boolean end();
    Object current();
    void next();
}