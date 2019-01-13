package com.homeworks.ivangolovich.spiskiderevo.myimpliment;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by home on 11/16/2018.
 */
public class MyHashMap<K, V> {

    private double loadFactor;
    private int initalCapasity;
    private int size = 0;

    Node<K, V>[] table;

    public MyHashMap() {
        this(0.75, 16);
    }

    public MyHashMap(double loadFactor, int initalCapasity) {
        this.loadFactor = loadFactor;
        this.initalCapasity = initalCapasity;
        this.table = new Node[initalCapasity];
    }

    private void transfer(Node<K, V>[] oldTable, Node<K, V>[] newTable) {
        for (int oldBucketIndex = 0; oldBucketIndex < oldTable.length; oldBucketIndex++) {
            Node<K, V> oldEntry = oldTable[oldBucketIndex];
            while (oldEntry != null) {
                K key = oldEntry.key;
                V value = oldEntry.value;
                int newBucketIndex = key.hashCode() % newTable.length;
                Node<K, V> newEntry = newTable[newBucketIndex];
                newTable[newBucketIndex] = newEntry;
                oldEntry = oldEntry.next;
            }

        }

    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return false;
    }


    public boolean containsKey(Object key) {
        return false;
    }


    public boolean containsValue(Object value) {
        return false;
    }


    public V get(Object key) {
        int index = key.hashCode() % table.length;;
        Node<K,V> list = table[index];
        while (list != null) {
            if (list.key.equals(key))
                return list.value;
            list = list.next;
        }
        return null;
    }


    public void put(K key, V value) {
        int bucketIndex = (Math.abs(key.hashCode())) % table.length;
        Node<K,V> currentNode = table[bucketIndex];
        if(currentNode == null){
            table[bucketIndex] = new Node<>(key,value);
        }else {
            boolean done = false;
            // traverse through list , if a key is found ,replace the value or add it at the end of the list
            while(currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    done = true;
                    break;
                }
                currentNode = currentNode.next;
            }
            // add at the end of the list
            if (!done)
                currentNode.next = new Node<K, V>(key, value);
        }
        size++;
        if(size * loadFactor > table.length ){
            Node<K,V> [] newTable = new Node[table.length*2];
            transfer(this.table,newTable);
        }

    }


    public void remove(Object key) {
        int index = (Math.abs(key.hashCode())) % table.length;;
        Node<K,V> list = table[index];
        if (list == null)
            return;
        // if only one element is present in the list ,set the index to null
        if(list.key.equals(key)){
            if (list.next == null){
                table[index] = null;
                return;
            }
        }
        Node<K,V> prev = null;
        do{
            if(list.key.equals(key)){
                if (prev == null){
                    list = list.next;
                }else{
                    prev.next = list.next;
                }
                break;
            }
            list = list.next;
        }while(list != null);

        table[index] = list;
    }


    public void putAll(Map<? extends K, ? extends V> m) {

    }


    public void clear() {

    }


    public Set<K> keySet() {
        return null;
    }


    public Collection<V> values() {
        return null;
    }





    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next = null;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;

        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?, ?> node = (Node<?, ?>) o;

            if (!key.equals(node.key)) return false;
            return value.equals(node.value);

        }

        @Override
        public int hashCode() {
            int result = key.hashCode();
            result = 31 * result + value.hashCode();
            return result;
        }
    }
}
