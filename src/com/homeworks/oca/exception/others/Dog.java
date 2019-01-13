package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Dog implements Friend {
   public String getName() throws RuntimeException { // h3
        return "Doggy";
    }

    public static void main(String[] adoption) {
        Friend friend = new Dog(); // h4
        System.out.print(((Cat) friend).getName()); // h5
        System.out.print(((Dog) null).getName()); // h6
    }
}

interface Friend {
     String getName(); // h1
}

class Cat implements Friend {
     public String getName() { // h2
        return "Kitty";
    }
}