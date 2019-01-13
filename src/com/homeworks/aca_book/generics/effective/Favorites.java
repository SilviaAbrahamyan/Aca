package com.homeworks.aca_book.generics.effective;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/**
 * Created by home on 12/21/2018.
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();
   public <T> void putFavorite(Class<T> type, T instance) {
       favorites.put(Objects.requireNonNull(type), instance);
    }

    // Achieving runtime type safety with a dynamic cast
   // public <T> void putFavorite(Class<T> type, T instance) {
   //     favorites.put(type, type.cast(instance));
   // }
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);
        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString,
                favoriteInteger, favoriteClass.getName());
    }
}
