package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("David", "Joe", "Mary", "Bailey", "Bruna");

        nomes.stream()
                .filter(e -> e.startsWith("B"))
                .forEach(System.out::println);
    }
}

//2. **Filtrar Nomes que Começam com "B":**
//- Crie uma `List` de strings com nomes de pessoas. Use `filter()`
//para selecionar apenas os nomes que começam com a
//letra "B" e imprima-os.
