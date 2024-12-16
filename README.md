# Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.

## Implementação da interface

- Estrutura do Programa: O programa começa com a classe **Program**, que cria uma lista de produtos e aplica uma atualização de preços.
- Classe **Product**: Define os atributos e métodos para manipular informações de produtos, incluindo métodos para acessar e modificar o nome e o preço.
- Classe **PriceUpdate**: Implementa a lógica para aumentar o preço de cada produto em 10% através da interface Consumer.

## Reference method com método estático

- Método Estático **staticPriceUpdate:**
    Agora, o método que atualiza o preço do produto em 10% é um método estático na classe Product. Isso permite que você
chame o método diretamente pela classe, utilizando uma referência de método.

- Uso de Referência de Método:
  Em vez de criar uma instância separada de PriceUpdate, o código agora usa Product::staticPriceUpdate, que é uma referência
ao método estático. Isso simplifica o código e mantém a lógica de atualização de preço dentro da própria classe Product.

- Comportamento do Programa:
  O comportamento geral do programa permanece o mesmo: ele cria uma lista de produtos, atualiza os preços e imprime os produtos com os novos preços.
  
Essas modificações tornam o código mais conciso e eliminam a necessidade de uma classe separada apenas para atualizar os preços dos produtos.

## Reference method com método não estático

- Método Não Estático **nonStaticPriceUpdate**:
  Este método agora é responsável por atualizar o preço do produto em 10%. Como é um método não estático, ele pode ser 
chamado em uma instância específica do objeto Product.

- Uso de Referência de Método:
  O método nonStaticPriceUpdate é chamado diretamente em cada instância de Product na lista usando Product::nonStaticPriceUpdate.
Isso permite que o método seja executado no contexto do objeto específico.

- Comportamento do Programa:
  O programa continua a criar uma lista de produtos, atualizar os preços e imprimir os produtos, mas agora utiliza a
lógica de atualização de preço que é específica para cada instância de Product.

### Vantagens de Métodos Não Estáticos:
- Encapsulamento: Métodos não estáticos permitem que a lógica que opera em dados de instâncias específicas seja encapsulada dentro da própria classe.
- Leitura e Manutenção: Usar métodos não estáticos pode tornar o código mais intuitivo e fácil de manter,
pois as operações são diretamente associadas ao objeto que as invoca.
- Flexibilidade: Métodos não estáticos podem acessar e modificar os atributos de uma instância específica, permitindo operações personalizadas em cada objeto.
- Polimorfismo: Métodos não estáticos podem ser substituídos em subclasses, permitindo a implementação de comportamentos específicos para diferentes tipos de objetos.
- Reutilização: Métodos não estáticos podem ser reutilizados em diferentes partes do código, pois operam em instâncias específicas de uma classe.
- Testabilidade: Métodos não estáticos podem ser testados de forma isolada, facilitando a verificação do comportamento de objetos individuais.
- Composição: Métodos não estáticos podem ser combinados em sequências de operações mais complexas, permitindo a construção de
comportamentos sofisticados a partir de operações simples.
- Herança: Métodos não estáticos podem ser herdados por subclasses, permitindo a reutilização de comportamentos comuns e a extensão de funcionalidades existentes.

### Desvantagens de Métodos Não Estáticos:
- Acoplamento: Métodos não estáticos estão intimamente ligados ao estado de uma instância específica, o que pode aumentar o acoplamento entre classes.
- Complexidade: Métodos não estáticos podem introduzir complexidade adicional ao código, especialmente quando operam em múltiplos objetos e dependem de estados compartilhados.
- Dependências: Métodos não estáticos podem depender de outros métodos e atributos de uma classe, o que pode tornar a manutenção e a compreensão do código mais desafiadoras.
- Escopo: Métodos não estáticos podem acessar e modificar o estado interno de um objeto, o que pode introduzir efeitos colaterais inesperados e dificultar a depuração de problemas.

## Expressão lambda declarada

- Expressão Lambda Declarada:
  - A expressão lambda ```Consumer<Product> cons = p -> { p.setPrice(p.getPrice() * factor); };``` é declarada para representar a lógica de atualização do preço.
  - p é o parâmetro que representa cada instância de Product na lista.
  - O corpo da lambda atualiza o preço do produto multiplicando pelo fator definido (1.1).

- Uso da Interface Consumer:
  A interface Consumer<Product> é usada para definir uma operação que aceita um único argumento (neste caso, um Product) e não retorna nenhum resultado. Isso permite que a expressão lambda seja usada diretamente com o método forEach.

- Comportamento do Programa:
  O programa continua a funcionar da mesma maneira: ele cria uma lista de produtos, aplica a atualização de preços usando a expressão lambda e imprime os produtos com os novos preços.

### Vantagens do Uso de Expressões Lambda:
- Concisão: As expressões lambda permitem que você escreva implementações de interfaces funcionais de forma mais concisa.
- Legibilidade: O código se torna mais fácil de ler e entender, pois a lógica é expressa diretamente onde é necessária.
- Flexibilidade: Você pode facilmente alterar a lógica dentro da lambda sem precisar criar uma nova classe ou método.
- Composição: Expressões lambda podem ser combinadas e passadas como argumentos para outros métodos, permitindo a construção de comportamentos complexos a partir de operações simples.
- Reutilização: Expressões lambda podem ser reutilizadas em diferentes partes do código, promovendo a

### Desvantagens do Uso de Expressões Lambda:
- Complexidade: Expressões lambda podem tornar o código mais complexo e difícil de entender, especialmente quando usadas em contextos complexos ou aninhados.
- Escopo: Expressões lambda podem acessar variáveis locais e de instância, o que pode introduzir efeitos colaterais e tornar o código menos previsível.
- Depuração: Expressões lambda podem dificultar a depuração de problemas, pois a lógica está encapsulada em um contexto anônimo.