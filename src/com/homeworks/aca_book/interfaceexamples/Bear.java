package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 10/13/2018.
 */
public class Bear implements Herbivore,Omnivore {
    @Override
    public int eatPlants() {
        return 0;
    }

//    @Override
//    public int eatPlants() {
//        return 0;
//    }
//
//    public void eatPlants() { // DOES NOT COMPILE
//        System.out.println("Eating plants");
//    }
}
