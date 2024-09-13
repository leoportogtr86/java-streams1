package com.porto.exercicios.lista7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("teste", "bolas", "macaca", "batata");
        Map<Integer, List<String>> agrupadorLength = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupadorLength);
    }
}
