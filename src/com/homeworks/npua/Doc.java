package com.homeworks.npua;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by home on 9/22/2018.
 */
public class Doc {
    private String name;
    private Map<String, Integer> array;

    public Doc(String name) {
        this.name = name;
        this.array = new HashMap<>();
    }

    public void put(String line) {
        String[] words = line.split("\\s+");;
        for (int i = 0; i < words.length; i++) {
            if (array.containsKey(words[i].toLowerCase())) {
                array.put(words[i], array.get(words[i]) + 1);
            } else {
                array.put(words[i].toLowerCase(), 1);
            }
        }
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getArray() {
        return array;
    }
}
