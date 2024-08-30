### Operações Intermediárias:

1. **Filtragem Simples:**  
   Crie uma `List` de inteiros e use o método `filter()` para selecionar apenas os números maiores que 10. Imprima os
   resultados usando uma operação terminal.

2. **Transformação de Elementos:**  
   Crie uma `List` de strings com nomes. Use o método `map()` para converter todos os nomes para letras minúsculas e
   imprima os resultados.

3. **Filtragem e Transformação:**  
   Crie uma `List` de strings com nomes. Primeiro, filtre os nomes que começam com a letra "A" e, em seguida, converta
   esses nomes para letras maiúsculas usando `map()`. Imprima os resultados.

4. **Remoção de Duplicatas:**  
   Crie uma `List` de inteiros com valores duplicados. Use `distinct()` para remover os duplicados e imprima a lista
   resultante.

5. **Ordenação de Strings:**  
   Crie uma `List` de strings com nomes de frutas. Use `sorted()` para ordenar a lista em ordem alfabética e imprima os
   resultados.

6. **Limitação de Resultados:**  
   Crie uma `List` de números inteiros. Use `limit()` para limitar a Stream aos primeiros 5 números e imprima-os.

7. **Pular Elementos:**  
   Crie uma `List` de inteiros. Use `skip()` para pular os primeiros 3 números e imprima os resultados restantes.

8. **Combinação de Operações Intermediárias:**  
   Crie uma `List` de strings com nomes de cidades. Filtre as cidades que têm mais de 5 letras, converta para letras
   maiúsculas, e ordene os resultados. Imprima a lista final.

9. **Stream Encadeada com Arrays:**  
   Crie um array de inteiros e transforme-o em uma Stream. Use `filter()`, `map()` e `sorted()` para filtrar os números
   pares, dobrar seus valores, e ordenar em ordem crescente. Imprima os resultados.

10. **Transformação e Filtragem Complexa:**  
    Crie uma `List` de strings representando endereços de e-mail. Use `filter()` para selecionar apenas os e-mails que
    contêm o domínio "@gmail.com", e `map()` para extrair apenas os nomes de usuário (a parte antes do "@"). Imprima os
    resultados.

### Operações Terminais:

11. **Impressão de Elementos:**  
    Crie uma `List` de strings com nomes de animais. Use `forEach()` para imprimir cada nome da lista.

12. **Redução de Inteiros:**  
    Crie uma `List` de inteiros. Use `reduce()` para calcular o produto de todos os números na lista e imprima o
    resultado.

13. **Conversão para Coleção:**  
    Crie uma `List` de strings com nomes de frutas. Use `filter()` para selecionar frutas que contêm a letra "a" e, em
    seguida, use `collect()` para armazenar os resultados em uma nova lista. Imprima a lista resultante.

14. **Contagem de Elementos:**  
    Crie uma `List` de inteiros e use o método `count()` para contar quantos números são maiores que 50. Imprima o
    resultado.

15. **Busca de Elemento:**  
    Crie uma `List` de strings com nomes de pessoas. Use `findFirst()` para encontrar o primeiro nome na lista que
    começa com a letra "J" e imprima o resultado usando `Optional`.

16. **Verificação de Condição:**  
    Crie uma `List` de inteiros. Use `allMatch()` para verificar se todos os números são positivos, `anyMatch()` para
    verificar se existe algum número par, e `noneMatch()` para verificar se não há números negativos. Imprima os
    resultados das verificações.

17. **Redução Personalizada:**  
    Crie uma `List` de strings com frases. Use `reduce()` para concatenar todas as frases em uma única string separada
    por espaços. Imprima o resultado.

18. **Max e Min em Streams:**  
    Crie uma `List` de inteiros e use `max()` para encontrar o maior número e `min()` para encontrar o menor número.
    Imprima ambos os resultados.

19. **Agrupamento de Dados:**  
    Crie uma `List` de strings com nomes de pessoas. Use `collect(Collectors.groupingBy())` para agrupar os nomes pelo
    seu comprimento (número de caracteres). Imprima o mapa resultante.

20. **Particionamento de Dados:**  
    Crie uma `List` de inteiros e use `collect(Collectors.partitioningBy())` para particionar os números em pares e
    ímpares. Imprima o mapa resultante.

Esses exercícios cobrem uma ampla gama de operações intermediárias e terminais, permitindo que você pratique e consolide
seu entendimento sobre a API de Streams em Java.