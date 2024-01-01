package com.example.java_project.repo;

import com.example.java_project.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Carrepo extends JpaRepository<Car,Integer> {
    @Query("SELECT p FROM Car p WHERE " +
           "p.make_name LIKE CONCAT('%',:query, '%')")
    //List<Car> searchCar(String query);


    List<Car> searchCar(String query);
}
