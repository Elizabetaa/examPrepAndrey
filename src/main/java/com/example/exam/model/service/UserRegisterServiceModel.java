package com.example.exam.model.service;

import java.math.BigDecimal;

public class UserRegisterServiceModel {

    private String username;
    private String password;
    private String email;
    private BigDecimal budget;

    public UserRegisterServiceModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public UserRegisterServiceModel setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }
}
