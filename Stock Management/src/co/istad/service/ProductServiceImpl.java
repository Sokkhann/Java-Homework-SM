package co.istad.service;

import co.istad.dao.ProductDao;
import co.istad.dao.ProductDaoImpl;
import co.istad.exception.ProductIdNotFoundException;
import co.istad.model.Product;
import co.istad.util.Singleton;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private final ProductDao productDao;

    public ProductServiceImpl() {
        productDao = Singleton.productDaoImpl();
    }
    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id)
                .orElseThrow(()
                        -> new ProductIdNotFoundException(
                        String.format("Product ID : %s does not exist in DB", id))
                );
    }

    @Override
    public Product updateById(Product product) {
        return productDao.updateById(product);
    }

    @Override
    public Product deleteById(Long id) {
        return productDao.deleteById(id);
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDao.selectByName(name);
    }
}
