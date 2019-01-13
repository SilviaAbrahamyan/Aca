package com.homeworks.oca.exception;

/**
 * Created by home on 11/14/2018.
 */
public class Games {
    public final static int finish(final int score) {
        final int win = 3;
      //  final int result = score++ < 5 ? 2 : win;
       // return result+=win;
        return win;
    }
    public static void main(final String[] v) {
        System.out.print(finish(Integer.parseInt(v[0])));
    }

    void   enjoyTheWeather(){

    }
}
