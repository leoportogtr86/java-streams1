package com.porto.exercicios.lista8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Particionamento {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> particionando = numeros.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));

        System.out.println(particionando);
    }
}
