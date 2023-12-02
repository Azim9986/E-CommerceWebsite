package com.example.java_project.service;

import com.example.java_project.entity.Product;
import com.example.java_project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product addAllProduct(Product product) {
        return productRepo.save(product);

    }
}
