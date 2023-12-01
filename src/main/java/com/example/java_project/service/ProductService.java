package com.example.java_project.service;

import com.example.java_project.entity.Product;
import com.example.java_project.repo.ProductRepo;
import com.example.java_project.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    ReviewRepo reviewRepo;

    public Product addAllProduct(Product product) {
        reviewRepo.save(product.getReview());


        return productRepo.save(product);
    }

    public List<Product> getAllProduct(Product product) {
        return productRepo.findAll();
    }

    public Optional<Product> getbyID(Integer productId) {
        return productRepo.findById(productId);
    }
}
