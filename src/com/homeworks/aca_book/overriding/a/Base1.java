package com.homeworks.aca_book.overriding.a;

import com.homeworks.aca_book.overriding.c.MyDouble;
import com.homeworks.aca_book.overriding.c.MyNumber;

/**
 * Created by home on 10/4/2018.
 */
public class Base1 {
    public Number foo(){
        System.out.println("Base1");
        return new Integer(4);
    }
}
