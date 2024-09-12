Aqui estão 20 exercícios práticos focados no uso do método `reduce()` em Streams Java:

### Exercícios Básicos

1. **Somar Números Inteiros:**
    - Crie uma `List` de inteiros e use `reduce()` para calcular a soma de todos os números. Imprima o resultado.

2. **Multiplicar Números Inteiros:**
    - Crie uma `List` de inteiros e use `reduce()` para calcular o produto de todos os números. Imprima o resultado.

3. **Concatenar Strings:**
    - Crie uma `List` de strings com palavras e use `reduce()` para concatenar todas as palavras em uma única string,
      separadas por espaços. Imprima o resultado.

4. **Encontrar o Maior Número:**
    - Crie uma `List` de inteiros e use `reduce()` para encontrar o maior número da lista. Imprima o resultado.

5. **Encontrar o Menor Número:**
    - Crie uma `List` de inteiros e use `reduce()` para encontrar o menor número da lista. Imprima o resultado.

### Exercícios Intermediários

6. **Somar Preços de Produtos:**
    - Crie uma classe `Produto` com atributos `nome` e `preco`. Crie uma `List` de produtos e use `reduce()` para
      calcular a soma dos preços. Imprima o resultado.

7. **Contar Elementos:**
    - Crie uma `List` de strings e use `reduce()` para contar quantos elementos existem na lista. (Use `reduce()` para
      somar 1 para cada elemento.)

8. **Calcular Média de Números:**
    - Crie uma `List` de inteiros e use `reduce()` para calcular a soma dos números. Depois, divida pela quantidade de
      números para encontrar a média. Imprima o resultado.

9. **Encontrar o Produto de Números Pares:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar apenas os números pares. Em seguida, use `reduce()`
      para multiplicá-los e imprimir o produto.

10. **Concatenar Primeiras Letras:**
    - Crie uma `List` de strings e use `reduce()` para concatenar as primeiras letras de cada string em uma única
      palavra. Imprima o resultado.

### Exercícios Avançados

11. **Encontrar o Valor Máximo em uma Lista Vazia:**
    - Crie uma `List` vazia de inteiros e use `reduce()` com um valor de identidade para garantir que o valor máximo
      seja zero (ou outro valor predefinido) se a lista estiver vazia. Imprima o resultado.

12. **Somar Valores com Valor Inicial:**
    - Crie uma `List` de inteiros e use `reduce()` com um valor de identidade para somar os números. Forneça um valor
      inicial (por exemplo, 10) e verifique como isso afeta o resultado.

13. **Multiplicar e Acrescentar Valor Inicial:**
    - Crie uma `List` de inteiros e use `reduce()` com um valor de identidade para multiplicar os números e adicionar um
      valor inicial (por exemplo, 2). Imprima o resultado.

14. **Redução de Números Decimais:**
    - Crie uma `List` de números `Double` e use `reduce()` para somá-los, começando com o valor de identidade 0.0.
      Imprima o resultado.

15. **Concatenar Strings com Sufixo:**
    - Crie uma `List` de strings e use `reduce()` para concatenar as strings, adicionando um sufixo a cada uma (por
      exemplo, ", Inc."). Imprima o resultado.

### Exercícios Combinados

16. **Somar Valores Pares e Ímpares Separadamente:**
    - Crie uma `List` de inteiros. Use `filter()` para separar números pares e ímpares e, em seguida, use `reduce()`
      para somar cada conjunto separadamente. Imprima os dois resultados.

17. **Calcular Produto de Valores Positivos:**
    - Crie uma `List` de inteiros que contenha números negativos e positivos. Use `filter()` para selecionar apenas os
      números positivos e use `reduce()` para calcular o produto deles. Imprima o resultado.

18. **Encontrar o Menor e o Maior Número com `reduce()`:**
    - Crie uma `List` de inteiros e use `reduce()` duas vezes: uma para encontrar o menor número e outra para encontrar
      o maior número. Imprima ambos os resultados.

19. **Calcular Soma de Números Maiores que 10:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar apenas os números maiores que 10. Use `reduce()` para
      calcular a soma e imprima o resultado.

20. **Concatenar Palavras com Valor Inicial:**
    - Crie uma `List` de palavras e use `reduce()` para concatenar as palavras, começando com um valor inicial, como "
      Frase: ". Imprima o resultado.

Esses exercícios abordam diferentes aspectos e possibilidades do método `reduce()` e são projetados para ajudar a
desenvolver a compreensão de como ele pode ser utilizado em uma ampla gama de situações.