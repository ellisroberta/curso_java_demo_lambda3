package application;

import model.entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {
        // Cria uma lista de produtos usando ArrayList
        List<Product> list = new ArrayList<>();

        // Adiciona novos produtos à lista com nome e preço
        list.add(new Product("Tv", 900.00)); // Produto: TV, Preço: 900.00
        list.add(new Product("Mouse", 50.00)); // Produto: Mouse, Preço: 50.00
        list.add(new Product("Tablet", 350.50)); // Produto: Tablet, Preço: 350.50
        list.add(new Product("HD Case", 80.90)); // Produto: HD Case, Preço: 80.90

        double factor = 1.1; // Fator de aumento de preço

        // Declara uma expressão lambda para atualizar o preço dos produtos
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor); // Atualiza o preço do produto multiplicando pelo fator
        };

        // Aplica a expressão lambda a cada produto na lista
        list.forEach(cons);

        // Imprime os produtos da lista após a atualização de preço
        list.forEach(System.out::println); // Exibe cada produto com o novo preço
    }
}