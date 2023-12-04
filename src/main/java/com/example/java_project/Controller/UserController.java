package com.example.java_project.Controller;

import com.example.java_project.Entity.User;
import com.example.java_project.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all-user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteuser(@PathVariable Long id ){
        return userService.deleteUser(id);
    }

//    @PutMapping("/update/{id}")
//    public String updateUser(@PathVariable Long id){
//        return userService.updateUser(id);
//    }


}
