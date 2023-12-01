package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer userId;
    private Integer rating;
    private String comments;
    private Timestamp time;
}
