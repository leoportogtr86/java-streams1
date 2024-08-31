package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 4, 5, 7, 10, 21, 3, 45, 100);

        inteiros.stream()
                .filter(e -> e > 10)
                .forEach(System.out::println);
    }
}

//3. **Filtrar Números Maiores que 10:**
//- Crie uma `List` de inteiros e use `filter()` para
//manter apenas os números maiores que 10. Imprima a lista
//resultante.