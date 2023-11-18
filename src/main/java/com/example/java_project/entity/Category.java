package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   // @Column(nullable = false)
    private String categoryName;

  //  @Column(length = 500, nullable = false)
    private String description;

    @Column(length = 100, nullable = false)
    private String image;

   private boolean active; // or enable

   /* @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();*/
}


