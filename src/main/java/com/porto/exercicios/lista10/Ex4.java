package com.porto.exercicios.lista10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> vazia = new ArrayList<>();
//        List<Integer> vazia = Arrays.asList(10, 21);
        Optional<Integer> primeiro = vazia.stream()
                .findFirst();

        System.out.println(primeiro.orElse(0));
    }
}

//4. **Usando `findFirst()` em uma Lista Vazia:**
//- Crie uma lista vazia e aplique o método `findFirst()`. Use
// `Optional.orElse()` para retornar um valor padrão se
//nenhum elemento for encontrado.
