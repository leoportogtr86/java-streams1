package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(10, 100, 20, 200, 1, 2, 3, 4, 5, 6);

        inteiros.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}

//6. **Limitação de Resultados:**
//Crie uma `List` de números inteiros. Use `limit()` para limitar a Stream
// aos primeiros 5 números e imprima-os.
