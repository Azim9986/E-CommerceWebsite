package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer product_category_id;

    private String product_name;

    private String description;

    private long price;
    private Integer stock;

    private byte image;

    private LocalDate create_date;


    private LocalDate update_date;

    private boolean is_active;
}
