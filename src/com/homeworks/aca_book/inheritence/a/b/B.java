package com.homeworks.aca_book.inheritence.a.b;

import com.homeworks.aca_book.inheritence.a.A;

/**
 * Created by home on 9/28/2018.
 */
public class B extends A{


    void foo(B c1, A a){



    }


    public String methodpulicB(){

        return "B";
    }

    protected String methodprotectedB(){

        return "B";
    }

    protected String methodprotectedA(){

        return "B";
    }

     String methodB(){

        return "B";
    }

    private String methodprivateB(){

        return "B";
    }
    public static void main( String ... args){
        A b1 = new B();

    //System.out.println(b1.methodprotectedA());

    }
}
