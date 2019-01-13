package com.homeworks.HM8;

import java.util.Arrays;

/**
 * Created by home on 10/17/2018.
 */
public class ArrayList {

    private Table[] arr = new Table[100];
    int index = -1;

    public void add(Table table) {
        if (index > arr.length - 2) {
            ensureSize();
        }
        arr[++index] = table;
    }

    public void add(int index, Table table) {
        if (this.index > arr.length - 2) {
            ensureSize();
        }
        Table [] newArray = new Table[arr.length];
        newArray = Arrays.copyOf(arr, arr.length);
        for (int i = index; i < arr.length - 1; i++) {
            newArray[i + 1] = arr[i];
        }
        newArray[index] = table;
        arr = newArray;
    }

    private void ensureSize() {
        int newCapacity = ((arr.length * 3) / 2);
        this.arr = Arrays.copyOf(arr, newCapacity);
    }

    public Table get(int index) {
        return arr[index];
    }

    public void remove(int index) {
        Table[] newArray = new Table[arr.length];
        int newIndex = index;
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArray[newIndex++] = arr[i];
        }
        arr = newArray;
    }

    public Table[] getElements() {
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }
}
