package com.homeworks.aca_book.interfaceexamples.abstraction;

/**
 * Created by home on 11/14/2018.
 */
public class Task3 extends Task3Abstract{
    private int z;

    public Task3(int z) {
        this.z = z;
    }

    @Override
    void print() {
        System.out.println(z);
    }

    public static void main(String[] args) {
        /* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero
		* 2. Dad() called
		* 3. Son.print() called in Dad() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
        Task3 task3 = new Task3(3);
        task3.print();
    }
}

abstract class Task3Abstract{
    abstract void print();
}