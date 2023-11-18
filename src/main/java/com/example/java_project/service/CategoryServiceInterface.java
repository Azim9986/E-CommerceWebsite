package com.example.java_project.service;

import com.example.java_project.entity.Category;

import java.util.List;

public interface CategoryServiceInterface  {
      public Category addCategory(Category category);

  public List<Category> getAllCategory();

  public   Category getCategoryById(Integer catidInteger);

  public   void deleteCategoryById(Integer catidInteger);
}
