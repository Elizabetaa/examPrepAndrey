package com.example.exam.init;

import com.example.exam.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class DBInit implements CommandLineRunner {
    private final CategoryService categoryService;

    DBInit(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.categoryService.initCategories();

    }
}
