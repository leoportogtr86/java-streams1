package com.porto.exercicios.lista1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] inteiros = {10, 20, 30, 40};
        int soma = Arrays.stream(inteiros).reduce(0, Integer::sum);

        System.out.println(soma);
    }
}


//7. **Operação de Redução:**
//        - Crie um array de inteiros e use a operação de redução `reduce()`
//        para calcular a soma de todos os números no
//array. Imprima o resultado.
