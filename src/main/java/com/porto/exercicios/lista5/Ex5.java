package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 0, 100, -12);
        Optional<Integer> menor = list.stream()
                .reduce((a, b) -> a < b ? a : b);

        menor.ifPresent(System.out::println);
    }
}

//5. **Encontrar o Menor Número:**
//- Crie uma `List` de inteiros e use `reduce()` para encontrar o
//menor número da lista. Imprima o resultado.
