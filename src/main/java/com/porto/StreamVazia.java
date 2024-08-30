package com.porto;

import java.util.stream.Stream;

public class StreamVazia {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();

        stream.forEach(System.out::println);
    }
}
