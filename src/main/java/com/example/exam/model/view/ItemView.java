package com.example.exam.model.view;

import java.math.BigDecimal;

public class ItemView {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imgUrl;

    public ItemView() {
    }

    public Long getId() {
        return id;
    }

    public ItemView setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemView setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemView setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemView setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public ItemView setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
}
