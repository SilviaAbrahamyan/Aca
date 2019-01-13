package com.homeworks.aca_book.nested;

/**
 * Created by home on 11/22/2018.
 */
public class OCA1 {
    private int c;
    public void foo(){
        final int x = 0;
        class inner{
            public void aVoid(){
               System.out.println(x);
               System.out.println(c);
            }
        }
    }
}
