package com.example.java_project.service;

import com.example.java_project.entity.Category;
import com.example.java_project.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryServiceInterface{
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public Category addCategory(Category category) {
        Category createdCategory= categoryRepo.save(category);
        return createdCategory;
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategoryById(Integer catidInteger) {
        return categoryRepo.findById(catidInteger).get();

    }

    @Override
    public void deleteCategoryById(Integer catidInteger) {
        categoryRepo.deleteById(catidInteger);

    }
}
