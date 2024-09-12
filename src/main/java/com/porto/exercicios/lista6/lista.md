Aqui está uma lista de 20 exercícios focados no uso do método `collect()` e da classe `Collectors` para coleta de
resultados em Streams Java:

### Exercícios Básicos

1. **Coletar em uma Lista:**
    - Crie uma `List` de números inteiros. Use `collect()` para filtrar os números pares e coletá-los em uma nova lista.
      Imprima a lista resultante.

2. **Coletar em um Conjunto:**
    - Crie uma `List` de strings que contenha palavras repetidas. Use `collect()` para coletar as palavras únicas em
      um `Set`. Imprima o conjunto resultante.

3. **Concatenar Strings:**
    - Crie uma `List` de nomes e use `collect()` com `Collectors.joining()` para concatenar todos os nomes em uma única
      string, separados por vírgulas. Imprima o resultado.

4. **Coletar em um Mapa:**
    - Crie uma `List` de strings e use `collect()` para criar um `Map`, onde a chave seja o comprimento da string e o
      valor seja a própria string. Imprima o mapa resultante.

5. **Agrupar por Comprimento de Strings:**
    - Crie uma `List` de palavras e use `collect()` com `Collectors.groupingBy()` para agrupar as palavras por seu
      comprimento. Imprima o mapa resultante.

### Exercícios Intermediários

6. **Particionar Números:**
    - Crie uma `List` de inteiros e use `collect()` com `Collectors.partitioningBy()` para particionar os números em
      dois grupos: os que são maiores que 5 e os que não são. Imprima os dois grupos.

7. **Soma de Valores:**
    - Crie uma `List` de inteiros e use `collect()` com `Collectors.summingInt()` para calcular a soma dos valores.
      Imprima o resultado.

8. **Contagem de Elementos:**
    - Crie uma `List` de strings e use `collect()` com `Collectors.counting()` para contar quantos elementos existem na
      lista. Imprima o resultado.

9. **Agrupar Palavras por Primeira Letra:**
    - Crie uma `List` de palavras e use `collect()` com `Collectors.groupingBy()` para agrupar as palavras pela primeira
      letra. Imprima o mapa resultante.

10. **Concatenar Strings com Sufixo e Prefixo:**
    - Crie uma `List` de nomes e use `collect()` com `Collectors.joining()` para concatenar todos os nomes, separados
      por uma vírgula, com um prefixo "Nomes: " e um sufixo ".". Imprima o resultado.

### Exercícios Avançados

11. **Coletar em um Mapa com Chave Duplicada:**
    - Crie uma `List` de strings com valores que têm chaves duplicadas (mesmo comprimento). Use `collect()`
      com `Collectors.toMap()` e resolva o conflito de chaves escolhendo o valor que aparece por último. Imprima o mapa
      resultante.

12. **Agrupar e Contar por Comprimento:**
    - Crie uma `List` de strings e use `collect()` com `Collectors.groupingBy()` e `Collectors.counting()` para agrupar
      as palavras pelo número de letras e contar quantas palavras têm cada número de letras. Imprima o mapa resultante.

13. **Agrupar e Somar Valores:**
    - Crie uma `List` de objetos `Produto` com atributos `categoria` e `preco`. Use `collect()`
      com `Collectors.groupingBy()` e `Collectors.summingDouble()` para agrupar os produtos por categoria e somar seus
      preços. Imprima o resultado.

14. **Criar um Mapa de Nomes e Idades:**
    - Crie uma `List` de objetos `Pessoa` com atributos `nome` e `idade`. Use `collect()` com `Collectors.toMap()` para
      criar um mapa onde a chave seja o nome e o valor seja a idade. Imprima o mapa resultante.

15. **Particionar Palavras por Comprimento:**
    - Crie uma `List` de palavras e use `collect()` com `Collectors.partitioningBy()` para particionar as palavras em
      dois grupos: aquelas com mais de 5 letras e aquelas com 5 ou menos. Imprima o mapa resultante.

### Exercícios Combinados

16. **Particionar e Contar Números:**
    - Crie uma `List` de inteiros e use `collect()` com `Collectors.partitioningBy()` para dividir os números em dois
      grupos: pares e ímpares. Use `Collectors.counting()` para contar quantos números existem em cada grupo. Imprima o
      mapa resultante.

17. **Agrupar e Encontrar o Máximo:**
    - Crie uma `List` de objetos `Produto` com atributos `categoria` e `preco`. Use `collect()`
      com `Collectors.groupingBy()` e `Collectors.maxBy()` para agrupar os produtos por categoria e encontrar o produto
      mais caro em cada grupo. Imprima o mapa resultante.

18. **Agrupar e Concatenar Nomes:**
    - Crie uma `List` de objetos `Pessoa` com atributos `cidade` e `nome`. Use `collect()` com `Collectors.groupingBy()`
      e `Collectors.joining(", ")` para agrupar as pessoas por cidade e concatenar os nomes das pessoas de cada cidade.
      Imprima o resultado.

19. **Coletar em um Mapa com Chave e Valor Personalizados:**
    - Crie uma `List` de strings e use `collect()` com `Collectors.toMap()` para criar um mapa onde a chave seja a
      string em letras maiúsculas e o valor seja o comprimento da string. Imprima o resultado.

20. **Concatenar Strings em Maiúsculas:**
    - Crie uma `List` de palavras e use `collect()` com `Collectors.mapping()` para converter as palavras para
      maiúsculas e, em seguida, use `Collectors.joining()` para concatenar todas as palavras em uma única string
      separada por espaços. Imprima o resultado.

Esses exercícios cobrem diferentes usos do método `collect()` e da classe `Collectors`, ajudando a praticar como
coletar, agrupar, particionar, contar e manipular dados em Streams Java.