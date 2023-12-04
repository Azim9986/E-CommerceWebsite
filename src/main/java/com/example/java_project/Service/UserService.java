package com.example.java_project.Service;

import com.example.java_project.Entity.User;
import com.example.java_project.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;


    public  List<User> getAllUsers() {
            return userRepo.findAll();
    }

    public String addUser(User user) {
        userRepo.save(user);
        return "Success! User Added. ";
    }

    public String deleteUser(Long id) {
        userRepo.deleteById(id);
        return "User Deleted Successfully!";
    }


//    public String updateUser(Long id) {
//        userRepo.
//        return "User Updated Successfully!";
//    }
}