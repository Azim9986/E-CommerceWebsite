package com.example.java_project.controller;

import com.example.java_project.entity.Product;
import com.example.java_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/name")

    public Product addAllProduct(@RequestBody Product product){
        return productService.addAllProduct(product);
    }
    @GetMapping("/get/{id}")
    public Optional<Product> search_Product(@PathVariable Integer id){
        return productService.search_product(id);
    }
}
