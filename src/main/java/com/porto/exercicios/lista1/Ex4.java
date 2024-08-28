package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("João Pessoa", "Imperatriz", "João Lisboa", "Curitba", "Rio Branco");
        Stream<String> cidadesParallelStream = cidades.parallelStream();

        cidadesParallelStream.forEach(System.out::println);
    }
}

//4. **Stream Paralela:**
//- Crie uma `List` de strings com nomes de cidades.
//Utilize o método `parallelStream()` para criar uma Stream
//paralela e imprima os nomes das cidades.
