package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> result = inteiros.stream().reduce((a, b) -> a * b);

        result.ifPresent(System.out::println);
    }
}

//12. **Redução de Inteiros:**
//Crie uma `List` de inteiros. Use `reduce()` para calcular o produto de todos
// os números na lista e imprima o
//resultado.