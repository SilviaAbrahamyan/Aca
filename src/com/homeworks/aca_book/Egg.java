package com.homeworks.aca_book;

/**
 * Created by home on 10/4/2018.
 */
public class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {

        int i = 1, j = -1;
        switch (i)
        {
            case 0: j = 1; /* Line 4 */
            case 2: j = 2;
            default: j = 0;
        }
        System.out.println("j = " + j);

        Egg egg = new Egg();
        System.out.println(egg.number);


        Tree tree = new Pine();
        if( tree instanceof Tree )
            System.out.println ("Pine");
        else if( tree instanceof Tree )
            System.out.println ("Tree");
        else if( tree instanceof Oak )
            System.out.println ( "Oak" );
        else
            System.out.println ("Oops ");
    }

    private int number = 3;

    {
        number = 4;
    }

}

class Tree {
}

class Pine extends Tree {
}

class Oak extends Tree {
}