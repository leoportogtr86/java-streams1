# Lista de 20 exercícios focados no uso do método `filter()` em Streams Java:

### Exercícios Básicos

1. **Filtrar Números Pares:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar apenas os números pares. Imprima a lista resultante.

2. **Filtrar Nomes que Começam com "B":**
    - Crie uma `List` de strings com nomes de pessoas. Use `filter()` para selecionar apenas os nomes que começam com a
      letra "B" e imprima-os.

3. **Filtrar Números Maiores que 10:**
    - Crie uma `List` de inteiros e use `filter()` para manter apenas os números maiores que 10. Imprima a lista
      resultante.

4. **Filtrar Strings por Comprimento:**
    - Crie uma `List` de strings e use `filter()` para selecionar apenas as strings que têm mais de 5 caracteres.
      Imprima a lista resultante.

5. **Filtrar Strings que Contêm "a":**
    - Crie uma `List` de strings e use `filter()` para selecionar apenas as strings que contêm a letra "a". Imprima a
      lista resultante.

### Exercícios Intermediários

6. **Filtrar Números Divisíveis por 3:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar apenas os números que são divisíveis por 3. Imprima a
      lista resultante.

7. **Filtrar Nomes que Terminam com "o":**
    - Crie uma `List` de strings com nomes de pessoas. Use `filter()` para selecionar apenas os nomes que terminam com a
      letra "o" e imprima-os.

8. **Filtrar Strings de Palavras Palíndromas:**
    - Crie uma `List` de strings e use `filter()` para selecionar apenas as strings que são palíndromas (que podem ser
      lidas da mesma forma de trás para frente). Imprima a lista resultante.

9. **Filtrar Números Negativos:**
    - Crie uma `List` de inteiros que contenha números positivos e negativos. Use `filter()` para selecionar apenas os
      números negativos e imprima a lista resultante.

10. **Filtrar Strings que Começam e Terminam com a Mesma Letra:**
    - Crie uma `List` de strings e use `filter()` para selecionar apenas as strings que começam e terminam com a mesma
      letra. Imprima a lista resultante.

### Exercícios Avançados

11. **Filtrar Objetos com Atributos Específicos:**
    - Crie uma classe `Produto` com os atributos `nome` e `preco`. Crie uma `List` de produtos e use `filter()` para
      selecionar apenas os produtos com preço superior a 50.0. Imprima a lista resultante.

12. **Filtrar Strings que Contêm Números:**
    - Crie uma `List` de strings que contenha palavras e números misturados. Use `filter()` para selecionar apenas as
      strings que contêm números. Imprima a lista resultante.

13. **Filtrar Datas Antes de 2000:**
    - Crie uma `List` de objetos `LocalDate` e use `filter()` para selecionar apenas as datas anteriores ao ano 2000.
      Imprima a lista resultante.

14. **Filtrar Strings com Vogais Duplas:**
    - Crie uma `List` de strings e use `filter()` para selecionar apenas as strings que contêm vogais duplas (como "
      oo", "ee"). Imprima a lista resultante.

15. **Filtrar Objetos por Atributos Complexos:**
    - Crie uma classe `Carro` com os atributos `marca`, `modelo`, e `ano`. Crie uma `List` de carros e use `filter()`
      para selecionar apenas os carros fabricados após 2015 e que sejam da marca "Toyota". Imprima a lista resultante.

### Exercícios Combinados

16. **Filtrar e Transformar em Maiúsculas:**
    - Crie uma `List` de strings com nomes de cidades. Use `filter()` para selecionar as cidades que começam com a
      letra "S" e, em seguida, transforme-as em letras maiúsculas. Imprima a lista resultante.

17. **Filtrar e Contar Elementos:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar apenas os números ímpares. Conte quantos números
      ímpares estão na lista e imprima o resultado.

18. **Filtrar e Ordenar Números:**
    - Crie uma `List` de inteiros. Use `filter()` para selecionar os números maiores que 50 e, em seguida, ordene os
      números restantes em ordem decrescente. Imprima a lista resultante.

19. **Filtrar e Reduzir:**
    - Crie uma `List` de inteiros e use `filter()` para selecionar os números pares. Use `reduce()` para somar os
      números pares e imprima o resultado final.

20. **Filtrar e Coletar em um Map:**
    - Crie uma classe `Aluno` com os atributos `nome` e `nota`. Crie uma `List` de alunos e use `filter()` para
      selecionar apenas os alunos com nota maior que 7.0. Use `collect()` para coletar os resultados em um `Map` onde a
      chave é o nome do aluno e o valor é a nota. Imprima o mapa resultante.

Esses exercícios proporcionam uma prática abrangente do método `filter()` em Java, abordando desde os conceitos básicos
até situações mais complexas e realistas. Eles ajudam a consolidar o entendimento da filtragem em Streams, mostrando
como ela pode ser aplicada a diferentes tipos de dados e cenários.