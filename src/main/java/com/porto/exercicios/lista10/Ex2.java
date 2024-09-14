package com.porto.exercicios.lista10;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 21, 31, 45, 46, 100, 200);

        integers.stream()
                .findAny()
                .ifPresent(System.out::println);
    }
}

//2. **Usando `findAny()` em uma Lista de Números:**
//- Crie uma lista de números inteiros e use o método `findAny()` para
// encontrar qualquer número. Verifique se o
//número foi encontrado e imprima o resultado.
