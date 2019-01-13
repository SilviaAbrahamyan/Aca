package com.homeworks.aca_book.io;

import java.io.Console;
import java.io.Serializable;

/**
 * Created by home on 11/13/2018.
 */
public class WriteDemo implements Serializable{

    public static void main(String args[]) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}
