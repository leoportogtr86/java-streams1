### Exercícios Básicos

1. **Usando `findFirst()` em uma Lista de Strings:**
    - Crie uma lista de nomes e use o método `findFirst()` para encontrar o primeiro nome na lista. Verifique se o nome
      foi encontrado e imprima o resultado.

2. **Usando `findAny()` em uma Lista de Números:**
    - Crie uma lista de números inteiros e use o método `findAny()` para encontrar qualquer número. Verifique se o
      número foi encontrado e imprima o resultado.

3. **Encontrar o Primeiro Número Maior que 5:**
    - Crie uma lista de números inteiros e use `filter()` e `findFirst()` para encontrar o primeiro número que seja
      maior que 5. Imprima o resultado.

4. **Usando `findFirst()` em uma Lista Vazia:**
    - Crie uma lista vazia e aplique o método `findFirst()`. Use `Optional.orElse()` para retornar um valor padrão se
      nenhum elemento for encontrado.

5. **Usando `findAny()` em uma Lista Vazia:**
    - Crie uma lista vazia e aplique o método `findAny()`. Verifique se algum valor foi encontrado e imprima o resultado
      ou uma mensagem informando que a lista está vazia.

### Exercícios Intermediários

6. **Buscar o Primeiro Nome com Mais de 4 Letras:**
    - Crie uma lista de nomes e use `filter()` e `findFirst()` para encontrar o primeiro nome que tenha mais de 4
      letras. Imprima o resultado.

7. **Buscar Qualquer Número Par:**
    - Crie uma lista de números inteiros e use `filter()` e `findAny()` para encontrar qualquer número par. Imprima o
      resultado.

8. **Buscar o Primeiro Nome que Começa com "A":**
    - Crie uma lista de nomes e use `filter()` e `findFirst()` para encontrar o primeiro nome que comece com a letra "
      A". Verifique se foi encontrado e imprima o resultado.

9. **Encontrar o Primeiro Elemento de um Array:**
    - Crie um array de números inteiros e transforme-o em uma Stream usando `Arrays.stream()`. Use `findFirst()` para
      encontrar o primeiro elemento e imprima o resultado.

10. **Buscar o Primeiro Número Negativo:**
    - Crie uma lista de números inteiros (incluindo positivos e negativos) e use `filter()` e `findFirst()` para
      encontrar o primeiro número negativo. Imprima o resultado.

### Exercícios Avançados

11. **Usar `findAny()` em uma Stream Paralela:**
    - Crie uma lista de números inteiros e use `findAny()` em uma Stream paralela (`parallelStream()`). Verifique o
      número retornado e discuta como ele pode variar em execuções diferentes.

12. **Buscar o Primeiro Produto com Preço Acima de 1000:**
    - Crie uma lista de objetos `Produto` com atributos `nome` e `preco`. Use `filter()` e `findFirst()` para encontrar
      o primeiro produto com preço superior a 1000. Imprima o resultado.

13. **Buscar o Primeiro Nome em Ordem Alfabeticamente Invertida:**
    - Crie uma lista de nomes e use `sorted()` para ordená-los em ordem decrescente. Depois, aplique `findFirst()` para
      encontrar o primeiro nome nessa nova ordem. Imprima o resultado.

14. **Buscar Qualquer Nome que Contenha a Letra "E":**
    - Crie uma lista de nomes e use `filter()` e `findAny()` para encontrar qualquer nome que contenha a letra "E".
      Imprima o resultado.

15. **Usando `findFirst()` e `findAny()` com `Optional.orElseThrow()`:**
    - Crie uma lista de nomes e use `findFirst()` ou `findAny()` para encontrar um nome, retornando uma exceção se
      nenhum nome for encontrado (use `orElseThrow()`).

### Exercícios Combinados

16. **Buscar o Primeiro Nome em uma Lista Ordenada:**
    - Crie uma lista de nomes e use `sorted()` para ordená-los em ordem alfabética. Depois, aplique `findFirst()` para
      encontrar o primeiro nome. Verifique o resultado.

17. **Buscar Qualquer Número em uma Lista Filtrada:**
    - Crie uma lista de números inteiros. Aplique um `filter()` para selecionar números maiores que 10 e use `findAny()`
      para encontrar qualquer um desses números. Verifique o resultado.

18. **Buscar o Primeiro Nome que Não Contenha a Letra "A":**
    - Crie uma lista de nomes e use `filter()` e `findFirst()` para encontrar o primeiro nome que **não** contenha a
      letra "A". Verifique se o nome foi encontrado e imprima o resultado.

19. **Comparar `findFirst()` e `findAny()` em Streams Paralelas:**
    - Crie uma lista de números inteiros. Use `findFirst()` e `findAny()` separadamente em Streams paralelas e compare
      os resultados. Execute o código várias vezes e observe as diferenças de comportamento.

20. **Buscar o Primeiro Produto que Satisfaça Múltiplas Condições:**
    - Crie uma lista de produtos com atributos `nome`, `preco`, e `categoria`. Use `filter()` para selecionar produtos
      da categoria "Eletrônicos" com preço superior a 500 e use `findFirst()` para encontrar o primeiro que satisfaça
      essas condições.

Esses exercícios abrangem uma ampla variedade de cenários envolvendo os métodos `findFirst()` e `findAny()`, desde o
básico até o uso em Streams paralelas e com condições mais complexas. Eles ajudarão a praticar a busca de elementos em
Streams e a compreensão de como os métodos lidam com dados de diferentes formas.