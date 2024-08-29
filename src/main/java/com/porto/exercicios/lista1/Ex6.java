package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        String[] cores = {"amarelo", "preto", "azul", "rosa", "vermelho"};
        Stream<String> streamCores = Arrays.stream(cores);

        streamCores.forEach(System.out::println);
    }
}

//6. **Criação de Stream a partir de Array:**
//- Crie um array de strings com nomes de cores.
//Use o método `Arrays.stream()` para criar uma
// Stream a partir desse array e imprima cada cor.
