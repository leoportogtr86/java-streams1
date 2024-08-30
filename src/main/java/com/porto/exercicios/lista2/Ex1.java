package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 40, 50, 6, 7, 8, 9, 10, 20);

        lista.stream()
                .filter((e) -> e > 10)
                .forEach(System.out::println);

    }
}

//1. **Filtragem Simples:**
//Crie uma `List` de inteiros e use o método `filter()` para selecionar apenas os
// números maiores que 10. Imprima os
//resultados usando uma operação terminal.
