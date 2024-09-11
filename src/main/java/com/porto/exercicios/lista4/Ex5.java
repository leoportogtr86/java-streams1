package com.porto.exercicios.lista4;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("opa", "alo", "ilha", "amigo", "flor", "brasileiro");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}

//5. **Obter Comprimento das Strings:**
//- Crie uma `List` de strings e use `map()` para obter o comprimento
//de cada string. Imprima a lista resultante.
