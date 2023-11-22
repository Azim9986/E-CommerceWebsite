package com.example.java_project.controller;
import com.example.java_project.entity.Product;
import com.example.java_project.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.java_project.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProductController {
    @Autowired   // Autowiring the repository
    private ProductRepository productRepository;

    // Build get all products Rest API
    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Build Create product Rest API
    @PostMapping("product")
    public Product createProduct(@RequestBody Product product) {   // createProduct method created
        return productRepository.save(product);
    }

    // Build get product by id Rest API
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found by Id" + id));
        return ResponseEntity.ok(product);
    }

    //Build update product Rest API
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product productDetails) {
        Product updateProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product does not exist with Id" + id));

        updateProduct.setProductCategoryId(productDetails.getProductCategoryId());
        updateProduct.setProductName(productDetails.getProductName());
        updateProduct.setDescription(productDetails.getDescription());
        updateProduct.setPrice(productDetails.getPrice());
        updateProduct.setStock(productDetails.getStock());
        updateProduct.setImageUrl(productDetails.getImageUrl());
        updateProduct.setCreatedDate(productDetails.getCreatedDate());
        updateProduct.setUpdatedDate(productDetails.getUpdatedDate());
        updateProduct.setIsActive(productDetails.getIsActive());

        productRepository.save(updateProduct);

        return ResponseEntity.ok(updateProduct);
    }

    // Build delete product Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Integer id){

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product does not exist with Id" + id));

        productRepository.delete(product);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
