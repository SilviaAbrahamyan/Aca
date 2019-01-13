package com.homeworks;

/**
 * Created by home on 10/26/2018.
 */
public class Swap {
    public static void main(String args[]) {
        Animal a = new Animal("Lion");
        Animal a1 = new Animal("Lion");
        Animal a2 = new Animal("Crocodile");
        String b = "43561";
        System.out.println("Before Swap:- a1:" + b);
        swap(b);
        System.out.println("After Swap:- a1:" + b);


        System.out.println("Before Modify: " + a);
        modify(a);
        System.out.println("After Modify: " + a);
    }

    private static void swap(String b) {
    }

    public static void modify(Animal animal) {
        animal.name = "tiger";
        //animal.setName("Tiger");
    }

    public static void swap(Animal animal1, Animal animal2) {
        String temp = animal1.name;
        animal1.name = animal2.name;
        animal2.name = temp;


    }


}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}