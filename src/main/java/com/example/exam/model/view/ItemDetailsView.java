package com.example.exam.model.view;

import java.math.BigDecimal;

public class ItemDetailsView {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    public ItemDetailsView() {
    }

    public Long getId() {
        return id;
    }

    public ItemDetailsView setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemDetailsView setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDetailsView setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemDetailsView setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
