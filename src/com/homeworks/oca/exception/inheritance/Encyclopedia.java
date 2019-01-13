package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Encyclopedia extends Book{
    public static String material ="dgh";

    public String getMaterial() {return super.material;}
    public static void main(String[] pages) {
        System.out.print(new Encyclopedia().getMaterial());
    }
}
abstract class Book {
    protected static String material ="fav";
    public Book() {}
    public Book(String material) {this.material = material;}
}