package com.edu.phuxuan.cntt.k17.demo.service;



import org.springframework.beans.factory.annotation.Autowired;

import com.edu.phuxuan.cntt.k17.demo.model.Product;
import com.edu.phuxuan.cntt.k17.demo.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }
}
