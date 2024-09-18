package com.porto.exercicios.lista1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
    public static void main(String[] args) {
        int[][] arrayInteiros = {{1, 2, 3}, {4, 5, 6}};
        IntStream stream = Arrays.stream(arrayInteiros).flatMapToInt(Arrays::stream);

        stream.forEach(System.out::println);
    }
}

//10. **Criação de Stream a partir de Arrays Multidimensionais:**
//- Crie um array bidimensional de inteiros (matriz) e converta-o em uma Stream.
//Utilize o método `flatMapToInt()`
//para transformar a matriz em uma `IntStream` plana (unidimensional) e, em seguida,
// imprima todos os elementos.
