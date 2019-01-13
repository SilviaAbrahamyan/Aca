package com.homeworks.aca_book.lambda;

import com.homeworks.live.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by home on 12/22/2018.
 */
public class Ex1 {
    public static void main(String[] args) {
        Predicate<Person> isAnAdult = person -> person.getAge() >= 18;



//        Integer nrOfAdults = people.stream()
//                .filter(isAnAdult)
//                .count();
    }

}
