package com.porto.exercicios.lista10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> integer = integers.stream().findAny();

        integer.ifPresent(e -> System.out.println("Valor encontrado => " + e));
    }
}
