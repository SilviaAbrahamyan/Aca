package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
// Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
 class Wrapping {
    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
}