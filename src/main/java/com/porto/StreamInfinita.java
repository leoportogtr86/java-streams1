package com.porto;

import java.util.stream.Stream;

public class StreamInfinita {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(Math::random);

        stream.limit(100).forEach(System.out::println);
    }
}
