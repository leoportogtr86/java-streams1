package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 0, 100, -12);
        Optional<Integer> maior = list.stream()
                .reduce((a, b) -> a > b ? a : b);

        maior.ifPresent(System.out::println);
    }
}

//4. **Encontrar o Maior Número:**
//- Crie uma `List` de inteiros e use `reduce()` para encontrar o
//maior número da lista. Imprima o resultado.
