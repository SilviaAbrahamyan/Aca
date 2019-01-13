package com.homeworks.HM7;

import java.util.Arrays;

/**
 * Created by home on 10/17/2018.
 */
public class ArrayList {

    private int[] arr = new int[10];
    int index = -1;

    public void add(int value) {
        if (index > arr.length - 2) {
            ensureSize();
        }
        arr[++index] = value;
    }

    public void add(int index, int value) {
        if (this.index > arr.length - 2) {
            ensureSize();
        }
        int[] newArray = new int[arr.length];
        newArray = Arrays.copyOf(arr, arr.length);
        for (int i = index; i < arr.length - 1; i++) {
            newArray[i + 1] = arr[i];
        }
        newArray[index] = value;
        arr = newArray;
    }

    private void ensureSize() {
        int newCapacity = ((arr.length * 3) / 2);
        this.arr = Arrays.copyOf(arr, newCapacity);
    }

    public int get(int index) {
        return arr[index];
    }

    public void remove(int index) {
        int[] newArray = new int[arr.length];
        int newIndex = index;
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArray[newIndex++] = arr[i];
        }
        arr = newArray;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(this.arr);
    }
}
