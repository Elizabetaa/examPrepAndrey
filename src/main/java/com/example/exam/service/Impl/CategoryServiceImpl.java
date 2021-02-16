package com.example.exam.service.Impl;

import com.example.exam.model.entities.Category;
import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.repository.CategoryRepository;
import com.example.exam.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void initCategories() {
        if (categoryRepository.count()==0){
            Arrays.stream(CategoryName.values()).forEach(c -> {
                Category category = new Category();
                category.setName(c).setDescription("Description for " + c.name());
                this.categoryRepository.save(category);
            });
        }
    }

    @Override
    public Category findCategory(CategoryName category) {
        return this.categoryRepository.findByName(category);
    }
}
