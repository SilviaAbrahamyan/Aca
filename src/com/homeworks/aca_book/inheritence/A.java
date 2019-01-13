package com.homeworks.aca_book.inheritence;

/**
 * Created by home on 9/28/2018.
 */
public class A extends AA{
    int i; // public by default
    private int j; // private to A

    public A(int i, int j) {
        super(j);
        this.i = i;
        this.j = j;
    }

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    public int getJ() {
        return j;
    }

    public static void main(String args[]) {
        
    }
}
