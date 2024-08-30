package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex8 {
    public static void main(String[] args) {
        int[] inteiros = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(inteiros);
        int produto = stream.reduce(1, (a, b) -> a * b);

        System.out.println(produto);
    }
}

//8. **Stream de Tipo Primitivo:**
//- Crie um array de números do tipo `int` contendo os valores de 1 a 5.
//Use o método `Arrays.stream()` para criar
//uma `IntStream` e calcule o produto de todos os números. Imprima o resultado.
