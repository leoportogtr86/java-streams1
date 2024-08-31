package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("ovo", "aba", "molda", "roma", "asa", "rotor");

        palavras.stream()
                .filter(e -> e.contentEquals(new StringBuilder(e).reverse()))
                .forEach(System.out::println);
    }
}

//8. **Filtrar Strings de Palavras Palíndromas:**
//- Crie uma `List` de strings e use `filter()` para selecionar
//apenas as strings que são palíndromas (que podem ser
//lidas da mesma forma de trás para frente). Imprima a lista resultante.
