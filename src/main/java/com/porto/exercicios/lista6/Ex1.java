package com.porto.exercicios.lista6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> pares = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(pares);
    }
}

//1. **Coletar em uma Lista:**
//        - Crie uma `List` de números inteiros. Use `collect()` para filtrar os
//        números pares e coletá-los em uma nova lista.
//Imprima a lista resultante.
