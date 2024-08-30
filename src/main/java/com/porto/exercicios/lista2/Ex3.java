package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Amanda", "Aurea", "Bob", "Jonh", "Alex");

        nomes.stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

//3. **Filtragem e Transformação:**
//Crie uma `List` de strings com nomes. Primeiro, filtre os nomes que começam
// com a letra "A" e, em seguida, converta
//esses nomes para letras maiúsculas usando `map()`. Imprima os resultados.
