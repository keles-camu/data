package com.jaisoft.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaisoft.api.User;
import com.jaisoft.api.repository.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {

    UserRepository userRepository; 

    public UserController(UserRepository userRepository){

        this.userRepository = userRepository;

    }

   
    @PostMapping("users")
    ResponseEntity<User>  createUser(User user){

       User userCreated = userRepository.save(user);
        return new ResponseEntity( userCreated, HttpStatus.CREATED);
    }
    
}
