package com.homeworks.oca.exception.others;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class PreSchool implements Closeable{
    public static void main(String[] args) {
        Blankie b1 = new Blankie();
        Blankie b2 = new Blankie();
        b1.color = "pink";
        List<Blankie> list = Arrays.asList(b1, b2);

      //list.stream().filter(Blankie::getColor).forEach(System.out::println);
    }

    @Override
    public void close() throws IOException {

    }
}
class Blankie {
    String color;
    String getColor() {
        return color;
    }
}