package com.porto.exercicios.lista9;

import java.util.Arrays;
import java.util.List;

public class Contagem {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("teste", "ola", "pilha", "bla bla", "aguia");
        long cont = palavras.stream()
                .filter(e -> e.length() >= 3)
                .count();

        System.out.println(cont);
    }
}
