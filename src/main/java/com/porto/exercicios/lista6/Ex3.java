package com.porto.exercicios.lista6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Joao", "Maria", "Leonardo", "Tyna");
        String concatenados = nomes.stream()
                .collect(Collectors.joining(" - "));

        System.out.println(concatenados);
    }
}

//3. **Concatenar Strings:**
//- Crie uma `List` de nomes e use `collect()` com `Collectors.joining()`
//para concatenar todos os nomes em uma única
//string, separados por vírgulas. Imprima o resultado.
