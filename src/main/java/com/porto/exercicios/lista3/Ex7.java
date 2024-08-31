package com.porto.exercicios.lista3;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("ovo", "amarelo", "verde", "azul", "abacate", "abrir", "bola");

        palavras.stream()
                .filter(e -> e.endsWith("o"))
                .forEach(System.out::println);
    }
}


//7. **Filtrar Nomes que Terminam com "o":**
//- Crie uma `List` de strings com nomes de pessoas. Use `filter()`
//para selecionar apenas os nomes que terminam com a
//letra "o" e imprima-os.