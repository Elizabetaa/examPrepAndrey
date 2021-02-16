package com.example.exam.model.service;

import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.model.entities.enums.GenderName;

import java.math.BigDecimal;

public class ItemServiceModel {
    private String name;
    private String description;
    private BigDecimal price;
    private CategoryName category;
    private GenderName gender;

    public ItemServiceModel() {
    }

    public String getName() {
        return name;
    }

    public ItemServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CategoryName getCategory() {
        return category;
    }

    public ItemServiceModel setCategory(CategoryName category) {
        this.category = category;
        return this;
    }

    public GenderName getGender() {
        return gender;
    }

    public ItemServiceModel setGender(GenderName gender) {
        this.gender = gender;
        return this;
    }
}
