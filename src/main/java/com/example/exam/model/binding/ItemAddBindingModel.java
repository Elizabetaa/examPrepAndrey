package com.example.exam.model.binding;

import com.example.exam.model.entities.Category;
import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.model.entities.enums.GenderName;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class ItemAddBindingModel {

    private String name;
    private String description;
    private BigDecimal price;
    private CategoryName category;
    private GenderName gender;

    public ItemAddBindingModel() {
    }

    @NotBlank(message = "Enter name")
    @Size(min = 2,message = "Name length must be more than two characters")
    public String getName() {
        return name;
    }

    public ItemAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank(message = "Enter description")
    @Size(min = 3,message = "Description length must be more than three characters")
    public String getDescription() {
        return description;
    }

    public ItemAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    @NotNull(message = "Enter price")
    @DecimalMin(value = "0",message = "Price must be positive number")
    public BigDecimal getPrice() {
        return price;
    }

    public ItemAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    @NotNull (message = "You must select the category")
    public CategoryName getCategory() {
        return category;
    }

    public ItemAddBindingModel setCategory(CategoryName category) {
        this.category = category;
        return this;
    }
    @NotNull (message = "You must select the gender")
    public GenderName getGender() {
        return gender;
    }

    public ItemAddBindingModel setGender(GenderName gender) {
        this.gender = gender;
        return this;
    }
}
