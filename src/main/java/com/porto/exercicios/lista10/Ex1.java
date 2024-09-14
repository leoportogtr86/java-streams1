package com.porto.exercicios.lista10;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Maria", "João", "Pedro", "Lucas", "Bia");

        nomes.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}

//1. **Usando `findFirst()` em uma Lista de Strings:**
//- Crie uma lista de nomes e use o método `findFirst()` para encontrar
// o primeiro nome na lista. Verifique se o nome
//foi encontrado e imprima o resultado.
