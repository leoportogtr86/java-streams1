package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        int produto = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(produto);
    }
}

//2. **Multiplicar Números Inteiros:**
//- Crie uma `List` de inteiros e use `reduce()` para calcular o produto
//de todos os números. Imprima o resultado.
