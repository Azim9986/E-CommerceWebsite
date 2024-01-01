package com.example.java_project.service;

import com.example.java_project.entity.Product;
import com.example.java_project.repo.ProductRepo;
import com.example.java_project.repo.Product_CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    Product_CategoryRepo productCategoryRepo;

    public Product addAllProduct(Product product) {
       // productCategoryRepo.save(product.getProduct_category_id());

        return productRepo.save(product);

    }


    public Optional<Product> search_product(Integer id) {
        return productRepo.findById(id);
    }
}




