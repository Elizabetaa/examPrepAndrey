package com.example.exam.service.Impl;

import com.example.exam.model.entities.User;
import com.example.exam.model.service.UserLoginServiceModel;
import com.example.exam.model.service.UserRegisterServiceModel;
import com.example.exam.repository.UserRepository;
import com.example.exam.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(UserRegisterServiceModel map) {
        this.userRepository.save(this.modelMapper.map(map, User.class));
    }

    @Override
    public boolean authenticate(UserLoginServiceModel map) {
        User allByUsernameAndPassword = this.userRepository.findByUsernameAndPassword(map.getUsername(), map.getPassword());
        return allByUsernameAndPassword != null;
    }
}
