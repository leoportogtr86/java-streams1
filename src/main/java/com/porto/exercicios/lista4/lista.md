# Lista de 20 exercícios focados no uso dos métodos `map()` e `flatMap()` em Streams Java:

### Exercícios Básicos com `map()`

1. **Converter Números em Strings:**
    - Crie uma `List` de inteiros e use `map()` para converter cada número em uma string. Imprima a lista resultante.

2. **Converter Strings para Maiúsculas:**
    - Crie uma `List` de strings com nomes de pessoas e use `map()` para converter todos os nomes para letras
      maiúsculas. Imprima a lista resultante.

3. **Calcular o Quadrado dos Números:**
    - Crie uma `List` de inteiros e use `map()` para calcular o quadrado de cada número. Imprima a lista resultante.

4. **Extrair a Primeira Letra de Cada Palavra:**
    - Crie uma `List` de strings e use `map()` para extrair a primeira letra de cada palavra. Imprima a lista
      resultante.

5. **Obter Comprimento das Strings:**
    - Crie uma `List` de strings e use `map()` para obter o comprimento de cada string. Imprima a lista resultante.

### Exercícios Intermediários com `map()`

6. **Transformar Objetos em Strings:**
    - Crie uma classe `Pessoa` com atributos `nome` e `idade`. Crie uma `List` de objetos `Pessoa` e use `map()` para
      extrair os nomes das pessoas. Imprima a lista resultante.

7. **Converter uma Lista de Double para Inteiros:**
    - Crie uma `List` de números do tipo `Double` e use `map()` para converter cada número para `Integer` (
      arredondando). Imprima a lista resultante.

8. **Adicionar Prefixo a Cada String:**
    - Crie uma `List` de strings e use `map()` para adicionar o prefixo "Sr./Sra." a cada nome. Imprima a lista
      resultante.

9. **Converter Preços de Produtos em Outra Moeda:**
    - Crie uma classe `Produto` com atributos `nome` e `preco`. Crie uma `List` de produtos e use `map()` para converter
      os preços de dólares para reais (supondo uma taxa de câmbio). Imprima a lista resultante.

10. **Obter a Raiz Quadrada dos Números:**
    - Crie uma `List` de inteiros e use `map()` para obter a raiz quadrada de cada número. Imprima a lista resultante.

### Exercícios Básicos com `flatMap()`

11. **Achatando uma Lista de Listas:**
    - Crie uma `List` de listas de inteiros e use `flatMap()` para transformar essa estrutura em uma única lista de
      inteiros. Imprima a lista resultante.

12. **Separar Palavras de Frases:**
    - Crie uma `List` de strings, onde cada string é uma frase. Use `flatMap()` para separar todas as palavras de todas
      as frases em uma única lista. Imprima a lista resultante.

13. **Achar Palavras em Linhas de Texto:**
    - Crie uma `List` de strings, onde cada string é uma linha de texto. Use `flatMap()` para obter uma lista de todas
      as palavras presentes nessas linhas. Imprima a lista resultante.

14. **Transformar uma Lista de Arrays em uma Lista de Elementos:**
    - Crie uma `List` de arrays de inteiros e use `flatMap()` para transformar esses arrays em uma única lista de
      inteiros. Imprima a lista resultante.

15. **Converter uma Lista de Opções para uma Lista de Valores Presentes:**
    - Crie uma `List` de `Optional<String>` e use `flatMap()` para criar uma lista que contém apenas os valores
      presentes (não vazios) desses opcionais. Imprima a lista resultante.

### Exercícios Intermediários com `flatMap()`

16. **Achar Todas as Combinações de Dois Conjuntos:**
    - Crie duas listas de strings. Use `flatMap()` para criar uma lista contendo todas as combinações possíveis de uma
      string da primeira lista com uma string da segunda lista. Imprima a lista resultante.

17. **Achar Palavras-Chave em Documentos:**
    - Crie uma classe `Documento` com um atributo `conteudo` (string). Crie uma `List` de documentos e use `flatMap()`
      para extrair todas as palavras-chave (usando um conjunto pré-definido de palavras-chave). Imprima a lista
      resultante.

18. **Separar e Contar Palavras:**
    - Crie uma `List` de frases. Use `flatMap()` para separar as palavras e `map()` para criar uma lista de pares
      contendo a palavra e seu comprimento. Imprima a lista resultante.

19. **Combinação de Objetos Complexos:**
    - Crie duas listas de objetos `Pessoa`, uma para homens e outra para mulheres. Use `flatMap()` para criar uma lista
      de casais (pares de um homem e uma mulher). Imprima a lista resultante.

20. **Filtrar e Achatar uma Lista de Listas:**
    - Crie uma `List` de listas de inteiros. Use `filter()` para manter apenas as listas que contêm pelo menos um número
      par e, em seguida, use `flatMap()` para achatar essas listas em uma única lista de inteiros. Imprima a lista
      resultante.

Esses exercícios cobrem uma ampla gama de aplicações para os métodos `map()` e `flatMap()` em Java, ajudando a praticar
e entender como transformar e manipular dados de forma eficiente usando Streams.