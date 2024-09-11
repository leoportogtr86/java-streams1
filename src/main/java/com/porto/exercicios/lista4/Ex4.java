package com.porto.exercicios.lista4;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("java", "javascript", "go", "ruby", "python");

        linguagens.stream()
                .map(e -> e.charAt(0))
                .forEach(System.out::println);
    }
}


//4. **Extrair a Primeira Letra de Cada Palavra:**
//- Crie uma `List` de strings e use `map()` para extrair a primeira
//letra de cada palavra. Imprima a lista
//resultante.
