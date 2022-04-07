package com.metedy.productms.service;

import com.metedy.productms.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAll();
}
