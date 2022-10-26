package com.edu.phuxuan.cntt.k17.demo.service;

import java.util.List;

import com.edu.phuxuan.cntt.k17.demo.model.Product;



public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
