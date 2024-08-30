package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("uva", "amora", "abacaxi", "manga", "graviola");

        frutas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}


//5. **Ordenação de Strings:**
//Crie uma `List` de strings com nomes de frutas. Use `sorted()` para ordenar
// a lista em ordem alfabética e imprima os
//resultados.