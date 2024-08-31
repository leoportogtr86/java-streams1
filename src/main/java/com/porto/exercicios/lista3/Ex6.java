package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 21, 3, 12, 15, 18, 24, 27, 32);

        list.stream()
                .filter(e -> e % 3 == 0)
                .forEach(System.out::println);
    }
}

//6. **Filtrar Números Divisíveis por 3:**
//- Crie uma `List` de inteiros e use `filter()` para
//selecionar apenas os números que são divisíveis por 3. Imprima a
//lista resultante.
