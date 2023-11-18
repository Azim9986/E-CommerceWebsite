package com.example.java_project.controller;

import com.example.java_project.entity.Category;
import com.example.java_project.service.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceInterface categoryServiceInterface;
@PostMapping("/create")
    public ResponseEntity<Category> addcategory(@RequestBody Category category)
    {
        Category categoryCreated= categoryServiceInterface.addCategory(category);
        return new ResponseEntity<Category>(categoryCreated, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAllCategory() {
        List<Category> listOfAllCategories = categoryServiceInterface.getAllCategory();
        return new ResponseEntity<List<Category>>(listOfAllCategories, HttpStatus.OK);

    }

    @GetMapping("/category/{catid}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("catid") Integer catidInteger) {
        Category categoryRetrieved = categoryServiceInterface.getCategoryById(catidInteger);
        return new ResponseEntity<Category>(categoryRetrieved, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category)
    {
        Category categoryUpdated = categoryServiceInterface.addCategory(category);
        return  new ResponseEntity<Category>(categoryUpdated, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{catid}")
    public ResponseEntity<Void> deleteCategoryById(@PathVariable ("catid") Integer catidInteger)
    {
        categoryServiceInterface.deleteCategoryById(catidInteger);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }



}
