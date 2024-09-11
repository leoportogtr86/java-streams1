package com.porto.exercicios.lista4;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bob", "Matt", "Phill", "John");

        nomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

//2. **Converter Strings para Maiúsculas:**
//- Crie uma `List` de strings com nomes de pessoas e use `map()` para
//converter todos os nomes para letras
//maiúsculas. Imprima a lista resultante.
