package com.example.java_project.Controller;

import com.example.java_project.entity.Product;
import com.example.java_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Api {
    @Autowired
    ProductService productService;

    @PostMapping("/post")
    public Product addAllProduct(@RequestBody Product product) {
        return productService.addAllProduct(product);
    }


    @GetMapping("/get/{id}")
    public Optional<Product> search_Product(@PathVariable Integer id) {
        return productService.search_product(id);

    }
}