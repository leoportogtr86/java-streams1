package com.porto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Juca", "Joe", "Maria", "Bob", "Tobby");
        Stream<String> stream = nomes.stream();

        stream.forEach(System.out::println);
    }
}
