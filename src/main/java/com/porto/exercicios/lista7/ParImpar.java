package com.porto.exercicios.lista7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Map<String, List<Integer>> agrupandoPorParidade = numeros.stream()
                .collect(Collectors.groupingBy(e -> e % 2 == 0 ? "Par" : "Ímpar"));

        System.out.println(agrupandoPorParidade);
    }
}
