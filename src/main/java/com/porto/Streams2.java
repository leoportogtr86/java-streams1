package com.porto;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        Stream<Integer> stream = set.stream();

        stream.forEach(System.out::println);
    }
}
