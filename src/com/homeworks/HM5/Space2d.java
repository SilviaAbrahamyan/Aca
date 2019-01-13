package com.homeworks.HM5;

/**
 * Created by home on 9/26/2018.
 */
public class Space2d {
    private final Object[] elements = new Object[100];
    private int cursor = 0;

    public void addElement(Object object) {
        elements[cursor++] = object;
    }

    public Object[] getElements() {
        int length = this.elements.length;
        Object[] elements = new Object[length];
        for(int i = 0; i < length; i++) {
            elements[i] = this.elements[i];
        }

        return elements;
    }
}
