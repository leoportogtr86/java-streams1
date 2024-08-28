package com.porto;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams3 {
    public static void main(String[] args) {
        String[] frutas = {"uva", "maçã", "laranja", "melancia"};
        Stream<String> stream = Arrays.stream(frutas);

        stream.forEach(System.out::println);
    }
}
