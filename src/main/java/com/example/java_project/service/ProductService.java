package com.example.java_project.service;

import com.example.java_project.entity.Product;
import com.example.java_project.repo.CategoryRepo;
import com.example.java_project.repo.Product_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    Product_repo productRepo;
    @Autowired
    CategoryRepo categoryRepo;

    public Product addAllProduct(Product product) {
        categoryRepo.save(product.getCategory());


        return productRepo.save(product);
    }

    public Optional<Product> search_product(Integer id) {
        return productRepo.findById(id);
    }
}
