package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 10, 4, -7, -9, 78, 100, -10);
        List<Integer> negativos = numeros.stream()
                .filter(e -> e < 0).toList();

        System.out.println(negativos);
    }
}


//9. **Filtrar Números Negativos:**
//- Crie uma `List` de inteiros que contenha números positivos
//e negativos. Use `filter()` para selecionar apenas os
//números negativos e imprima a lista resultante.
