package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 10/13/2018.
 */
public class WarmBlooded implements IsBloodedWarm {
  static   int  v = 9;


    public static void main(String[] args) {


        v = 7;
        System.out.println(new WarmBlooded().getTemperature());
        System.out.println(new WarmBlooded().hasScales());

        System.out.println(new WarmBlooded().v);
        IsWarmBlooded i = new WarmBlooded();
        System.out.println(IsBloodedWarm.v);
    }

    @Override
    public boolean hasScales() {
        return false;
    }
}
