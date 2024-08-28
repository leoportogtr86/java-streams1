package com.porto.exercicios.lista1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(100);
        inteiros.add(10);
        inteiros.add(1);

        Stream<Integer> stream = inteiros.stream();

        stream.sorted((a, b) -> b - a).forEach(System.out::println);
    }
}

//5. **Criação de Stream a partir de Set:**
//- Crie um `Set` de números inteiros. Converta o `Set` em uma
//Stream utilizando o método `stream()` e, em seguida,
//ordene os números em ordem decrescente antes de imprimi-los.
