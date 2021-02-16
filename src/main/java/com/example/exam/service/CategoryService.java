package com.example.exam.service;

import com.example.exam.model.entities.Category;
import com.example.exam.model.entities.enums.CategoryName;

public interface CategoryService {
    void initCategories();

    Category findCategory(CategoryName category);
}
