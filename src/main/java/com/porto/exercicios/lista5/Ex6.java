package com.porto.exercicios.lista5;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Sapato", 150.00);
        Produto p2 = new Produto("Camiseta", 99);
        Produto p3 = new Produto("Calça", 180.00);
        Produto p4 = new Produto("Boné", 45.00);
        Produto p5 = new Produto("Pulseira", 15.00);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        double somaPrecos = produtos.stream()
                .reduce(0, (subtotal, produto) -> (int) (subtotal + produto.getPreco()), Integer::sum);

        System.out.println(somaPrecos);
    }
}

//6. **Somar Preços de Produtos:**
//- Crie uma classe `Produto` com atributos `nome` e `preco`.
//Crie uma `List` de produtos e use `reduce()` para
//calcular a soma dos preços. Imprima o resultado.
