package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(20, 10, 45, 77, 88, 99);

        inteiros.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}

//7. **Pular Elementos:**
//Crie uma `List` de inteiros. Use `skip()` para pular os primeiros 3 números e
// imprima os resultados restantes.
