package com.example.java_project.controller;

import com.example.java_project.entity.Product;
import com.example.java_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class API {
    @Autowired
    ProductService productService;
    @PostMapping("/post")
    public Product addAllProduct(@RequestBody Product product){
        return productService.addAllProduct(product);
    }
    @GetMapping("/get")
    public List<Product> getAllProduct(Product product){
        return productService.getAllProduct(product);
    }
    @GetMapping("/get/{productId}")
    public Optional<Product> getByID(@PathVariable Integer productId){
        return productService.getbyID(productId);
    }
}
