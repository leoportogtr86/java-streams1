package com.porto.exercicios.lista4;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numeros.stream()
                .map(Object::toString)
                .forEach(System.out::println);
    }
}

//1. **Converter Números em Strings:**
//        - Crie uma `List` de inteiros e use `map()` para converter
//        cada número em uma string. Imprima a lista resultante.
