package com.morykeita.userservice.service;


import com.morykeita.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
