package com.porto.exercicios.lista10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo1 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("mola", "mala", "abacate", "ceu", "milho");
        Optional<String> primeiro = palavras.stream().findFirst();

        primeiro.ifPresent(System.out::println);
    }
}
