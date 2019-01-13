package com.homeworks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by home on 12/22/2018.
 */
public class ex1 {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s1: array) result = result + s1;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("1", String::concat);
        System.out.println(word); // wolf

        Stream<Integer> stream1 = Stream.of(3, 5, 6);
        System.out.println(stream1.reduce(2, (a, b) -> a*b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty1 = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty1.reduce(op).ifPresent(System.out::print); // no output
        oneElement.reduce(op).ifPresent(System.out::print); // 3
        threeElements.reduce(op).ifPresent(System.out::print); // 90

        Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
        s2.distinct().forEach(System.out::print); // duckgoose


        List<String> list1 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
                list1.stream().filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .forEach(System.out::println);


        Stream<Integer> infinite = Stream.iterate(1,  x -> x + 1);
        infinite.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
    }
}
