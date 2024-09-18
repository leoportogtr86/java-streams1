package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex9 {
    public static void main(String[] args) {
        int[] inteiros = {10, 21, 4, 78, 45, 10};
        IntStream stream = Arrays.stream(inteiros);

        stream.filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .sorted()
                .forEach(System.out::println);
    }
}

//9. **Stream Encadeada com Arrays:**
//Crie um array de inteiros e transforme-o em uma Stream. Use `filter()`, `map()` e
// `sorted()` para filtrar os números pares, dobrar seus valores, e ordenar em
// ordem crescente. Imprima os resultados.
