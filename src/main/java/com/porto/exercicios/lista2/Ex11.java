package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> animais = Arrays.asList("cão", "águia", "gato", "elefante");

        animais.forEach(System.out::println);
    }
}

//11. **Impressão de Elementos:**
//Crie uma `List` de strings com nomes de animais. Use `forEach()`
// para imprimir cada nome da lista.
