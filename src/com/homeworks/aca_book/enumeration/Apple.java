package com.homeworks.aca_book.enumeration;

/**
 * Created by home on 11/20/2018.
 */
public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price; // price of each apple
    // Constructor
    Apple(int p) { price = p; }
      int getPrice() { return price; }
}
class EnumDemo {
    public static void main(String args[])
    {
        Apple ap;
        ap = Apple.RedDel;
// Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
// Compare two enum values.
        if(ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");
// Use an enum to control a switch statement.
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}
class EnumDemo2 {
    public static void main(String args[])
    {
        Apple ap;
        System.out.println("Here are all Apple constants:");
// use values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);
        System.out.println();
// use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
class EnumDemo3 {
    public static void main(String args[])
    {
        Apple ap;

// Display price of Winesap.
        System.out.println("Winesap costs " +
                Apple.Winesap.getPrice() +
                " cents.\n");
// Display all apples and prices.
        System.out.println("All apple prices:");
        for(Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents.");
    }
}
class EnumDemo4 {
    public static void main(String args[])
    {
        Apple ap, ap2, ap3;
// Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants" +
                " and their ordinal values: ");
        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
// Demonstrate compareTo() and equals()
        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();
        if(ap.equals(ap2))
            System.out.println("Error!");
        if(ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}