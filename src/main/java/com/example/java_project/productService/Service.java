package com.example.java_project.productService;

import com.example.java_project.entity.Product;
import com.example.java_project.repo.ProductRepo;
import com.example.java_project.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
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

    public Optional<Product> getProductById(Integer productId) {
        return productRepo.findById(productId);
    }
}
