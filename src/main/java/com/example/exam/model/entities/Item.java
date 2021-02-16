package com.example.exam.model.entities;

import com.example.exam.model.entities.enums.GenderName;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item extends BaseEntity{
    private String name;
    private String description;
    private BigDecimal price;
    private Category category;
    private GenderName gender;

    public Item() {
    }

    @Column(unique = true,nullable = false)
    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public Item setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public Item setCategory(Category category) {
        this.category = category;
        return this;
    }

    @Enumerated(value = EnumType.STRING)
    public GenderName getGender() {
        return gender;
    }

    public Item setGender(GenderName genderName) {
        this.gender = genderName;
        return this;
    }
}
