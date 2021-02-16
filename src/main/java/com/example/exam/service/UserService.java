package com.example.exam.service;

import com.example.exam.model.service.UserLoginServiceModel;
import com.example.exam.model.service.UserRegisterServiceModel;

public interface UserService {
    void registerUser(UserRegisterServiceModel map);

    boolean authenticate(UserLoginServiceModel map);
}
