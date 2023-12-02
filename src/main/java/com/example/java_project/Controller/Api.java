package com.example.java_project.Controller;

import com.example.java_project.entity.Product;
import com.example.java_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {
    @Autowired
    ProductService productService;
    @PostMapping("/post")
    public Product addAllProduct(@RequestBody Product product)
    {
        return productService.addAllProduct(product);
    }
}
