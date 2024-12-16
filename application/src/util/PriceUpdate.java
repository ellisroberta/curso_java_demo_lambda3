package util;

import model.entities.Product;

import java.util.function.Consumer;

// Classe que implementa a interface Consumer para atualizar o preço do produto
public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        // Aumenta o preço do produto em 10%
        p.setPrice(p.getPrice() * 1.1); // Multiplica o preço atual por 1.1
    }
}