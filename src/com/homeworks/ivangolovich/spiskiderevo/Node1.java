package com.homeworks.ivangolovich.spiskiderevo;

/**
 * Created by home on 11/4/2018.
 */
public class Node1<E> {
    E element;
    Node1<E> node1;

    public Node1(E element) {
        this.element = element;
        node1 = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node1<?> node11 = (Node1<?>) o;

        if (!element.equals(node11.element)) return false;
        return node1.equals(node11.node1);

    }

    @Override
    public int hashCode() {
        int result = element.hashCode();
        result = 31 * result + node1.hashCode();
        return result;
    }
}

class HashSet<E> {
    Node1<E>[] arr = null;
}