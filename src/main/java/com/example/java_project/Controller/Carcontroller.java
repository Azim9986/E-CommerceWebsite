package com.example.java_project.Controller;

import com.example.java_project.entity.Car;
import com.example.java_project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/car")
public class Carcontroller {
    @Autowired
   private  CarService carservice;



    public Carcontroller(CarService carservice) {
        this.carservice = carservice;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Car>> searchCar(@RequestParam("query") String query) {
        return ResponseEntity.ok(carservice.searchCar(query));

    }

    @PostMapping("/add")
    public Car addcar(@RequestBody Car car) {
        return carservice.addCar(car);
    }
    @GetMapping("/getall")
    public List<Car> getAll(){
        return carservice.findAll();
    }
}

