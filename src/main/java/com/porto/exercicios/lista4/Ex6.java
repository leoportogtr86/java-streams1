package com.porto.exercicios.lista4;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Leo", 38));
        pessoas.add(new Pessoa("Joe", 18));
        pessoas.add(new Pessoa("Lizzy", 28));
        pessoas.add(new Pessoa("Donny", 23));

        pessoas.stream()
                .map(Pessoa::getNome)
                .forEach(System.out::println);
    }
}


//6. **Transformar Objetos em Strings:**
//- Crie uma classe `Pessoa` com atributos `nome` e `idade`. Crie uma `List`
// de objetos `Pessoa` e use `map()` para extrair os nomes das pessoas. Imprima
// a lista resultante.
