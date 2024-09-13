package com.porto.exercicios.lista6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("bola", "bola", "raquete", "tenis", "tenis");
        Set<String> semRepeticoes = new HashSet<>(palavras);

        System.out.println(semRepeticoes);
    }
}

//2. **Coletar em um Conjunto:**
//- Crie uma `List` de strings que contenha palavras repetidas.
//Use `collect()` para coletar as palavras únicas em
//um `Set`. Imprima o conjunto resultante.
