package co.istad.dao;

import co.istad.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    Product insert(Product product);
    List<Product> select();
    Optional<Product> selectById(Long id);
    Product updateById(Product product);
    Product deleteById(Long id);
    List<Product> selectByName(String name);
}
