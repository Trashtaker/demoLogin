package com.example.RegistrationDemo.service;

import com.example.RegistrationDemo.dto.UserDto;
import com.example.RegistrationDemo.model.User;
import com.example.RegistrationDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplement implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), userDto.getPassword() , userDto.getRole(), userDto.getFullname());
        return userRepository.save(user);
    }


}