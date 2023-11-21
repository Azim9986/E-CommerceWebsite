package com.example.java_project.controller;

import com.example.java_project.entity.Product;
import com.example.java_project.productService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Api {
    @Autowired
    Service service;
    @PostMapping("/post")
    public Product addAllProduct(@RequestBody Product product) {
        return service.addAllProduct(product);
    }
    @GetMapping("/get")
    public List<Product> getAllProduct(@RequestBody Product product){
        return service.getAllProduct(product);
    }
    @GetMapping("/get/{productId}")
    public Optional<Product> getProductById(@PathVariable Integer productId){
        return service.getProductById(productId);
    }
}
