package com.example.RegistrationDemo.service;


import com.example.RegistrationDemo.dto.UserDto;
import com.example.RegistrationDemo.model.User;

public interface UserService {

    User save (UserDto userDto);


}