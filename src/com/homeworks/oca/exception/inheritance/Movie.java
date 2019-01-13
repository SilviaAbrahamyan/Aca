package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Movie  extends Cinema {
    public Movie(String movie) {
        super(movie);
    }
    public static void main(String[] showing) {
     //   System.out.print(new Movie("adv").name);
    }
}
class Cinema {
    private String name;
    public Cinema(String name) {this.name = name;}

}