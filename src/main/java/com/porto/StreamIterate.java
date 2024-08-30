package com.porto;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, n -> n + 2);

        stream.limit(100).forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10) // Limitando para os primeiros 10 números
                .map(fib -> fib[0]) // Extraindo o primeiro número do par (que é o número da sequência)
                .forEach(System.out::println); // Imprimindo os números da sequência de Fibonacci
    }
}
