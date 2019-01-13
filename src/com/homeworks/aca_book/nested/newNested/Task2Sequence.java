package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 10/18/2018.
 */
public class Task2Sequence {
    private Object[] items;
    private int next = 0;
    public Task2Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        private Task2Sequence createOuter(){
            return Task2Sequence.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Task2Sequence sequence = new Task2Sequence(10).new SequenceSelector().createOuter();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Task2Sequence sequence1 = new Task2Sequence(3);
        Word w = new Word("24");
        Word w1 = new Word("sfa");
        Word w2 = new Word("2fda4");
        sequence1.add(w);
        sequence1.add(w1);
        sequence1.add(w2);
        Selector selector1 = sequence1.selector();
        while(!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}
class Word {
    private String word;
    public Word(String s) { word = s; }
    public String toString() { return word; }
}