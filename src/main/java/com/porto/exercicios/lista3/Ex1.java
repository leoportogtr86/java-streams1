package com.porto.exercicios.lista3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            inteiros.add(i);
        }

        inteiros.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}

//1. **Filtrar Números Pares:**
//- Crie uma `List` de inteiros e use `filter()` para selecionar
//apenas os números pares. Imprima a lista resultante.
