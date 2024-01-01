package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MakeCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int make_id;
    private String make_name;
    @OneToOne
    private Car car;
}
