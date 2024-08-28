package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("uva", "laranja", "melancia", "java");
        List<String> frutasUpper = frutas
                .stream()
                .map(String::toUpperCase)
                .toList();

        frutasUpper.forEach(System.out::println);
    }
}


//3. **Transformação de Elementos:**
//        - Crie uma `List` de strings com nomes de frutas. Utilize o
//        método `map()` para converter todos os nomes para letras
//        maiúsculas e, em seguida, imprima os resultados.
