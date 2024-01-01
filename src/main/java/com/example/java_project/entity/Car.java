package com.example.java_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int car_id;
     private  int make_id;
    private String make_name;
    private int model_id;
    private int body_style_id;
    private int price;
    private boolean availability;
    private int engine_size;
    private int horsepower;
    @OneToOne
    private MakeCar makecar;

}

