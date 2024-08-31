package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("bola", "aula", "video game", "pc", "notas");

        palavras.stream()
                .filter(e -> e.contains("a"))
                .forEach(System.out::println);
    }
}

//5. **Filtrar Strings que Contêm "a":**
//- Crie uma `List` de strings e use `filter()` para selecionar
//apenas as strings que contêm a letra "a". Imprima a
//lista resultante.
