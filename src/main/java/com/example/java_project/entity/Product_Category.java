package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Product_Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private  String  catagary_name;
    private String description;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;
    private boolean is_active;


     {
    }
}
