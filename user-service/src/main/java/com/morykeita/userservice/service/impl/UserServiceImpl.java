package com.morykeita.userservice.service.impl;

import com.morykeita.userservice.entity.UserEntity;
import com.morykeita.userservice.repository.UserRepository;
import com.morykeita.userservice.service.UserService;
import com.morykeita.userservice.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mapper.map(userDetails,UserEntity.class);
        //userEntity.setEncryptedPassword(BCrypt.);
        userRepository.save(userEntity);
        return null;
    }
}
