package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("Bahia", "São Paulo", "João Pessoa", "Recife", "Rio de Janeiro");

        cidades.stream()
                .filter(e -> e.length() > 5)
                .forEach(System.out::println);
    }
}

//8. **Combinação de Operações Intermediárias:**
//Crie uma `List` de strings com nomes de cidades. Filtre as cidades que
// têm mais de 5 letras, converta para letras
//maiúsculas, e ordene os resultados. Imprima a lista final.
