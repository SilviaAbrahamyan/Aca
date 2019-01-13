package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class Park {
    public final static void main(String... arguments) {
        int pterodactyl = 6;
        long triceratops = 3;
        if(pterodactyl % 3 >= 1)
            triceratops++;
        triceratops--;
        System.out.print(triceratops);
    }
}
