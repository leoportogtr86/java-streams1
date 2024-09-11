package com.porto.exercicios.lista4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);

        System.out.println(integers);

        List<Integer> sqrtList = integers.stream()
                .map(e -> e * e)
                .toList();

        System.out.println(sqrtList);
    }
}

//3. **Calcular o Quadrado dos Números:**
//- Crie uma `List` de inteiros e use `map()` para calcular
//o quadrado de cada número. Imprima a lista resultante.
