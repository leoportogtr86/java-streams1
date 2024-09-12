package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Olá, ", "me ", "chamo Bob.");
        String frase = palavras.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println(frase);
    }
}

//3. **Concatenar Strings:**
//- Crie uma `List` de strings com palavras e use `reduce()` para
//concatenar todas as palavras em uma única string,
//separadas por espaços. Imprima o resultado.
