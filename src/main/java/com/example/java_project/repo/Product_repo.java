package com.example.java_project.repo;

import com.example.java_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Product_repo extends JpaRepository<Product, Integer> {

/*    @Query("SELECT u FROM Product u where u.product_name = :product_name")
    Optional<Product> findByProduct_name(@Param("product_name")String product_name);*/
}
