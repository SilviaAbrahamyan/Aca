package com.homeworks.oca.exception.others;

import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class Alligator {
    static int teeth;
    double scaleToughness;
    public Alligator() {
        teeth++;
    }
    public void snap(int teeth) {
        System.out.print(teeth+" ");
        teeth--;
    }
    public static void main(String[] unused) {
        new Alligator().snap(teeth);
        new Alligator().snap(teeth);

        String name = "Desiree";
        int _number = 694;
        boolean profit$$$;
        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = drinks.size(); container > 0; container++) {
            System.out.print(drinks.get(container-1) + ",");
        }
    }
}
