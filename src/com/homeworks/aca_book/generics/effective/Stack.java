package com.homeworks.aca_book.generics.effective;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by home on 12/21/2018.
 */
public class Stack<E> {
    private E[] elements;
    private Object[] elements1;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        //  elements = new E[DEFAULT_INITIAL_CAPACITY];
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked")
        E result = (E)elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
}
