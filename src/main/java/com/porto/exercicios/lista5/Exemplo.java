package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> result = list.stream()
                .reduce(Integer::sum);

        result.ifPresent(System.out::println);
    }
}
