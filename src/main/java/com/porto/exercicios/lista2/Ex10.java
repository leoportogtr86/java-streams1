package com.porto.exercicios.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("m1@email.com", "m1@gmail.com", "m2@email.com", "m3@email.com", "m4@email.com", "m4@gmail.com");

        emails.stream()
                .filter(e -> e.contains("gmail.com"))
                .map(e -> e.replace("@gmail.com", ""))
                .forEach(System.out::println);

    }
}

//10. **Transformação e Filtragem Complexa:**
//Crie uma `List` de strings representando endereços de e-mail. Use `filter()` para
// selecionar apenas os e-mails que
//contêm o domínio "@gmail.com", e `map()` para extrair apenas
// os nomes de usuário (a parte antes do "@"). Imprima os
//resultados.

