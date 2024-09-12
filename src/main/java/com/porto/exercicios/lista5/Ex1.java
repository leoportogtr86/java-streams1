package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 30, 400);
        int soma = list.stream()
                .reduce(0, Integer::sum);

        System.out.println(soma);
    }
}

//1. **Somar Números Inteiros:**
//- Crie uma `List` de inteiros e use `reduce()` para calcular a soma de
//todos os números. Imprima o resultado.
