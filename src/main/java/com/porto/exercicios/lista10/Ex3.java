package com.porto.exercicios.lista10;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 6, 10, 21, 31, 10, 45, 789, 54, 0, -789, 456);

        integers.stream()
                .filter(e -> e > 5)
                .findFirst()
                .ifPresent(System.out::println);
    }
}


//3. **Encontrar o Primeiro Número Maior que 5:**
//- Crie uma lista de números inteiros e use `filter()` e `findFirst()`
//para encontrar o primeiro número que seja
//maior que 5. Imprima o resultado.
