package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_category_id", nullable = false)
    private Integer productCategoryId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    private String description;

    private Long price;

    private Integer stock;

    @Column(name = "image", nullable = false)
    private String imageUrl;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "updated_date", nullable = false)
    private Date updatedDate;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}


