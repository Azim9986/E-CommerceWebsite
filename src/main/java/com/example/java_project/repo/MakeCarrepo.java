package com.example.java_project.repo;

import com.example.java_project.entity.MakeCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MakeCarrepo extends JpaRepository<MakeCar,Integer> {
}
