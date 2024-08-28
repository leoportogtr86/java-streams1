package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = inteiros.stream();

        stream.forEach(System.out::println);
    }
}

//1. **Criação de Stream a partir de List:**
//        - Crie uma `List` de inteiros contendo os números de 1 a 10.
//        Utilize o método `stream()` para criar uma Stream a
//partir dessa lista e imprima todos os elementos da Stream.
