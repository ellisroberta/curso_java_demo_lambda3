# Problema Exemplo
Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.

## Implementação da Interface

- **Estrutura do Programa**: O programa começa com a classe **Program**, que cria uma lista de produtos e aplica uma atualização de preços.
- **Classe Product**: Define os atributos e métodos para manipular as informações dos produtos, incluindo métodos para acessar e modificar o nome e o preço.
- **Classe PriceUpdate**: Implementa a lógica para aumentar o preço de cada produto em 10% através da interface `Consumer`.

## Reference Method com Método Estático

- **Método Estático `staticPriceUpdate`**:
  O método que atualiza o preço do produto em 10% é um método estático na classe `Product`. Isso permite que você chame o método diretamente pela classe, utilizando uma referência de método.

- **Uso de Referência de Método**:
  Em vez de criar uma instância separada de `PriceUpdate`, o código agora usa `Product::staticPriceUpdate`, que é uma referência ao método estático. Isso simplifica o código e mantém a lógica de atualização de preço dentro da própria classe `Product`.

- **Comportamento do Programa**:
  O comportamento geral do programa permanece o mesmo: ele cria uma lista de produtos, atualiza os preços e imprime os produtos com os novos preços. Essas modificações tornam o código mais conciso e eliminam a necessidade de uma classe separada apenas para atualizar os preços dos produtos.

## Reference Method com Método Não Estático

- **Método Não Estático `nonStaticPriceUpdate`**:
  Este método é responsável por atualizar o preço do produto em 10%. Como é um método não estático, pode ser chamado em uma instância específica do objeto `Product`.

- **Uso de Referência de Método**:
  O método `nonStaticPriceUpdate` é chamado diretamente em cada instância de `Product` na lista usando `Product::nonStaticPriceUpdate`, permitindo que o método seja executado no contexto do objeto específico.

- **Comportamento do Programa**:
  O programa continua a criar uma lista de produtos, atualizar os preços e imprimir os produtos, mas agora utiliza a lógica de atualização de preço específica para cada instância de `Product`.

### Vantagens de Métodos Não Estáticos
- **Encapsulamento**: Permitem que a lógica que opera em dados de instâncias específicas seja encapsulada dentro da própria classe.
- **Leitura e Manutenção**: Tornam o código mais intuitivo e fácil de manter, pois as operações são diretamente associadas ao objeto que as invoca.
- **Flexibilidade**: Podem acessar e modificar os atributos de uma instância específica, permitindo operações personalizadas em cada objeto.
- **Polimorfismo**: Podem ser substituídos em subclasses, permitindo a implementação de comportamentos específicos para diferentes tipos de objetos.
- **Reutilização**: Podem ser reutilizados em diferentes partes do código, pois operam em instâncias específicas de uma classe.
- **Testabilidade**: Podem ser testados de forma isolada, facilitando a verificação do comportamento de objetos individuais.
- **Composição**: Podem ser combinados em sequências de operações mais complexas, permitindo a construção de comportamentos sofisticados a partir de operações simples.
- **Herança**: Podem ser herdados por subclasses, permitindo a reutilização de comportamentos comuns e a extensão de funcionalidades existentes.

### Desvantagens de Métodos Não Estáticos
- **Acoplamento**: Estão intimamente ligados ao estado de uma instância específica, o que pode aumentar o acoplamento entre classes.
- **Complexidade**: Podem introduzir complexidade adicional ao código, especialmente quando operam em múltiplos objetos e dependem de estados compartilhados.
- **Dependências**: Podem depender de outros métodos e atributos de uma classe, tornando a manutenção e a compreensão do código mais desafiadoras.
- **Escopo**: Podem acessar e modificar o estado interno de um objeto, o que pode introduzir efeitos colaterais inesperados e dificultar a depuração de problemas.

## Expressão Lambda Declarada

- **Expressão Lambda Declarada**:
  - A expressão lambda `Consumer<Product> cons = p -> { p.setPrice(p.getPrice() * factor); };` é declarada para representar a lógica de atualização do preço.
  - `p` é o parâmetro que representa cada instância de `Product` na lista.
  - O corpo da lambda atualiza o preço do produto multiplicando pelo fator definido (1.1).

- **Uso da Interface Consumer**:
  A interface `Consumer<Product>` é usada para definir uma operação que aceita um único argumento (neste caso, um `Product`) e não retorna nenhum resultado. Isso permite que a expressão lambda seja usada diretamente com o método `forEach`.

- **Comportamento do Programa**:
  O programa funciona da mesma maneira: cria uma lista de produtos, aplica a atualização de preços usando a expressão lambda e imprime os produtos com os novos preços.

### Vantagens do Uso de Expressões Lambda
- **Concisão**: Permitem que você escreva implementações de interfaces funcionais de forma mais concisa.
- **Legibilidade**: O código se torna mais fácil de ler e entender, pois a lógica é expressa diretamente onde é necessária.
- **Flexibilidade**: Você pode facilmente alterar a lógica dentro da lambda sem precisar criar uma nova classe ou método.
- **Composição**: Podem ser combinadas e passadas como argumentos para outros métodos, permitindo a construção de comportamentos complexos a partir de operações simples.
- **Reutilização**: Podem ser reutilizadas em diferentes partes do código, promovendo a reutilização de lógica.

### Desvantagens do Uso de Expressões Lambda
- **Complexidade**: Podem tornar o código mais complexo e difícil de entender, especialmente quando usadas em contextos complexos ou aninhados.
- **Escopo**: Podem acessar variáveis locais e de instância, o que pode introduzir efeitos colaterais e tornar o código menos previsível.
- **Depuração**: Podem dificultar a depuração de problemas, pois a lógica está encapsulada em um contexto anônimo.

## Expressão Lambda Inline

- **Expressão Lambda Inline**:
  - A expressão lambda `p -> p.setPrice(p.getPrice() * factor)` é utilizada diretamente dentro do método `forEach`, eliminando a necessidade de declarar uma variável separada.
  - `p` representa cada instância de `Product` na lista, e a lógica dentro da lambda atualiza o preço multiplicando-o pelo fator definido (1.1).

- **Simplicidade e Clareza**:
  Utilizar uma expressão lambda inline torna o código mais conciso e fácil de entender, pois a lógica de atualização do preço é expressa diretamente na chamada do método `forEach`.

- **Comportamento do Programa**:
  O programa continua a funcionar da mesma maneira: cria uma lista de produtos, aplica a atualização de preços usando a expressão lambda inline e imprime os produtos com os novos preços.

### Vantagens do Uso de Expressões Lambda Inline
- **Concisão**: Reduz a quantidade de código necessário, eliminando a necessidade de declarações intermediárias.
- **Legibilidade**: Facilita a leitura do código, pois a lógica é apresentada de forma direta e clara.
- **Flexibilidade**: Permite que a lógica seja facilmente alterada sem a necessidade de reestruturação significativa, já que tudo acontece em um único local.
- **Composição**: Podem ser combinadas e aninhadas para criar comportamentos complexos de forma concisa.
- **Reutilização**: Podem ser usadas em diferentes partes do código, promovendo a reutilização de lógica.
- **Performance**: A eliminação de declarações intermediárias pode resultar em um código mais eficiente e com menos sobrecarga.
- **Manutenção**: Facilita a manutenção do código, pois a lógica é apresentada de forma direta e não requer navegação entre diferentes partes do arquivo.
- **Depuração**: A lógica é apresentada de forma clara e direta, facilitando a identificação e correção de problemas.
- **Escopo**: A lógica é encapsulada em um contexto específico, reduzindo a possibilidade de efeitos colaterais indesejados.
- **Simplicidade**: Reduz a complexidade do código, tornando-o mais simples e fácil de entender.
- **Eficiência**: Elimina a necessidade de declarações intermediárias, resultando em um código mais eficiente e direto.
- **Clareza**: A lógica é expressa de forma direta e concisa, facilitando a compreensão do código.

### Desvantagens do Uso de Expressões Lambda Inline
- **Complexidade**: Podem tornar o código mais complexo e difícil de entender, especialmente quando usadas em contextos complexos ou aninhados.