package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        List<String> animais = Arrays.asList("cão", "gato", "galinha", "vaca", "leão", "camaleão");
        List<String> startWithC = animais
                .stream()
                .filter((nome) -> nome.startsWith("c"))
                .toList();
        List<String> maiusculas = startWithC
                .stream()
                .map(String::toUpperCase)
                .toList();

        maiusculas.forEach(System.out::println);
    }
}

//9. **Combinação de Operações:**
//Crie uma `List` de strings com nomes de animais.
//Crie uma Stream que filtre os nomes que começam com a letra "C",
//converta esses nomes para letras minúsculas e imprima os resultados.
