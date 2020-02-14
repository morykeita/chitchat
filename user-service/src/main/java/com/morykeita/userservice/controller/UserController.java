package com.morykeita.userservice.controller;

import com.morykeita.userservice.dto.UserDto;
import com.morykeita.userservice.model.CreateUserRequest;
import com.morykeita.userservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/status/check")
    public String test(){
        return "account-service working";
    }

    //@PostMapping()
    public ResponseEntity createUser(@Valid  @RequestBody CreateUserRequest userDetails){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto = mapper.map(userDetails,UserDto.class);
        userService.createUser(userDto);
        return  new ResponseEntity(HttpStatus.CREATED);
    }
}
