package com.example.java_project.service;

import com.example.java_project.entity.Car;

import java.util.List;

public interface Cservice {
    List<Car> searchCar(String query);

    Car addCar(Car car);


    List<Car> findAll();
}
