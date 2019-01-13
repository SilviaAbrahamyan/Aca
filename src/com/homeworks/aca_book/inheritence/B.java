package com.homeworks.aca_book.inheritence;

/**
 * Created by home on 9/28/2018.
 */
public class B extends A{
    int total;

    public B(int total, int x, int y) {
        super(x,y);
        this.total = total;
    }

    void sum() {
        total = i; // ERROR, j is not accessible here
    }
}
class Access {
    public static void main(String args[]) {
        AA subOb = new AA(3);
        //subOb.setij(10, 12);
       // System.out.println("Total Super is " + subOb.getJ());
    }
}