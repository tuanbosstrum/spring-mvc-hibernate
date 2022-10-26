package com.edu.phuxuan.cntt.k17.demo.repository;

import java.util.List;

import com.edu.phuxuan.cntt.k17.demo.model.Product;



public interface ProductRepository {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
