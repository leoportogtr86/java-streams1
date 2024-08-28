package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = inteiros.stream();
        List<Integer> pares = stream
                .filter((e -> e % 2 == 0))
                .toList();

        System.out.println(pares);
    }
}

//2. **Filtragem em Stream:**
//        - Usando a mesma `List` de inteiros do exercício anterior, crie
//        uma Stream e filtre os números pares. Imprima os
//números pares resultantes.
