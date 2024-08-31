package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("uva", "mala", "TI", "Brasil", "abacate", "Joia", "Abracadabra");

        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(System.out::println);
    }
}


//4. **Filtrar Strings por Comprimento:**
//- Crie uma `List` de strings e use `filter()` para selecionar
//apenas as strings que têm mais de 5 caracteres.
//Imprima a lista resultante.
