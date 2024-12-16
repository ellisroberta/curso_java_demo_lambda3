package model.entities;

// Classe que representa um produto com nome e preço
public class Product {

    private String name; // Nome do produto
    private Double price; // Preço do produto

    // Construtor que inicializa o nome e o preço do produto
    public Product(String name, Double price) {
        this.name = name; // Inicializa o nome
        this.price = price; // Inicializa o preço
    }

    // Método getter para obter o nome do produto
    public String getName() {
        return name; // Retorna o nome do produto
    }

    // Método setter para definir o nome do produto
    public void setName(String name) {
        this.name = name; // Atualiza o nome do produto
    }

    // Método getter para obter o preço do produto
    public Double getPrice() {
        return price; // Retorna o preço do produto
    }

    // Método setter para definir o preço do produto
    public void setPrice(Double price) {
        this.price = price; // Atualiza o preço do produto
    }

    // Método estático que atualiza o preço do produto em 10%
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    // Método que retorna uma representação em string do produto
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price); // Formata o preço para duas casas decimais
    }
}
