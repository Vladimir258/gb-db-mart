package ru.gb.dao;

import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();
    String findTitleById(Long id);
    Product findById(Long id);
    void insert(Product product);
    void update(Product product);
    void deleteById(Long id);
}
