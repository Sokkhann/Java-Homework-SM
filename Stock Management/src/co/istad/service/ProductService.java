package co.istad.service;

import co.istad.model.Product;

import java.util.List;

public interface ProductService {
    Product insert(Product product);
    List<Product> select();
    Product selectById(Long id);
    Product updateById(Product product);
    Product deleteById(Long id);
    List<Product> selectByName(String name);
}
