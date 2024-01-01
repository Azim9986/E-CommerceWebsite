package com.example.java_project.service;

import com.example.java_project.entity.Car;
import com.example.java_project.entity.MakeCar;
import com.example.java_project.repo.Carrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements Cservice {
    @Autowired
    private Carrepo carrepo;


    public CarService(Carrepo carrepo) {
        this.carrepo = carrepo;
    }


    public List<Car> searchCar(String query) {


        List<Car>car=carrepo.searchCar(query);
        return car;

      //  return carrepo.findById(Integer.valueOf(query));
    }


    @Override
    public Car addCar(Car car) {
        return  carrepo.save(car);

    }

    @Override
    public List<Car> findAll() {
        return carrepo.findAll();
    }

    public List<Car>getAll()
    {
        return  carrepo.findAll();
    }


    public Car getAll(Car car) {
        return carrepo.save(car);
    }
}







