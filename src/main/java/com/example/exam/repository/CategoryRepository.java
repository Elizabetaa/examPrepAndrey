package com.example.exam.repository;

import com.example.exam.model.entities.Category;
import com.example.exam.model.entities.enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(CategoryName name);
}
