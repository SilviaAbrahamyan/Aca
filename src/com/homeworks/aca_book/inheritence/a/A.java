package com.homeworks.aca_book.inheritence.a;

import com.homeworks.aca_book.inheritence.a.b.B;
import com.homeworks.aca_book.inheritence.a.b.B1;
import com.homeworks.aca_book.inheritence.a.c.C;
import com.homeworks.aca_book.inheritence.a.c.C1;

/**
 * Created by home on 9/28/2018.
 */
public class A  {
    private int i;
    int j;
    protected int k;
    public int z = 5;


    public String methodpulicA(){

        return "A";
    }

    protected String methodprotectedB(){

        return "A";
    }

    String methodB(){

        return "A";
    }

    private String methodprivateB(){

        return "A";
    }

    public static void main( String ... args){
        B b1 = new B();



    }
}
