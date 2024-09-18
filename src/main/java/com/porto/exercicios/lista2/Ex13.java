package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex13 {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("banana", "maçã", "melancia", "mamão", "laranja");
        List<String> frutasComA = frutas.stream()
                .filter(e -> e.contains("a"))
                .toList();

        System.out.println(frutasComA);
    }
}

//13. **Conversão para Coleção:**
//Crie uma `List` de strings com nomes de frutas. Use `filter()` para selecionar
// frutas que contêm a letra "a" e, em seguida, use `collect()` para armazenar os
// resultados em uma nova lista. Imprima a lista resultante.
