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