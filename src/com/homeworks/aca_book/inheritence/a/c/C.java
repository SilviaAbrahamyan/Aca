package com.homeworks.aca_book.inheritence.a.c;

import com.homeworks.aca_book.inheritence.a.A;
import com.homeworks.aca_book.inheritence.a.b.B;

/**
 * Created by home on 9/28/2018.
 */
public class C extends B  {



    void foo(C c, B b){


    }

    public String methodpulicC(){

        return "C";
    }

    protected String methodprotectedC(){

        return "C";
    }

    String methodC(){

        return "C";
    }

    private String methodprivateC(){

        return "C";
    }

    public static void main( String ... args){
        B b1 = new B();


    }
}
