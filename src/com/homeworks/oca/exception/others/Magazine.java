package com.homeworks.oca.exception.others;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by home on 11/22/2018.
 */
public class Magazine {
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
    public String toString() {
        return name;
    }


}
class Newstand {
    public static void main(String[] args) {
        Set<Magazine> set = new TreeSet<>();
      set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
        Set<String> s  = new TreeSet<>();
    }
}
