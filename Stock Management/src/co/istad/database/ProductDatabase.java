package co.istad.database;
import co.istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private final List<Product> products;
    public ProductDatabase() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Ice Cream", 120, 0.5, LocalDate.now()));
        products.add(new Product(2L, "Dutch Milk", 120, 0.5, LocalDate.now()));
        products.add(new Product(3L, "Kit Kat", 120, 3.49, LocalDate.now()));
        products.add(new Product(4L, "Hanami", 120, 0.5, LocalDate.now()));
        products.add(new Product(5L, "Coke", 120, 1.0, LocalDate.now()));
    }
    public List<Product> getProducts() {
        return products;
    }
}
