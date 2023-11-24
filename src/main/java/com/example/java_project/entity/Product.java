package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
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

    @OneToOne
    private Category category;


}
