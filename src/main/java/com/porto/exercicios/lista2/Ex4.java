package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> duplicados = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 40);

        duplicados.stream()
                .distinct()
                .forEach(System.out::println);
    }
}


//4. **Remoção de Duplicatas:**
//Crie uma `List` de inteiros com valores duplicados. Use `distinct()`
// para remover os duplicados e imprima a lista
//resultante.
