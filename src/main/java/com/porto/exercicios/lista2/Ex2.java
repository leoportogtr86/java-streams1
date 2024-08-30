package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Luara", "Luiz", "Manoel", "Izalick");

        nomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}


//2. **Transformação de Elementos:**
//Crie uma `List` de strings com nomes. Use o método `map()` para converter
// todos os nomes para letras minúsculas e
//imprima os resultados.
