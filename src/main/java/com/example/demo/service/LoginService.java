package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserService userService;

    public boolean userExistsByEmailAndPass(String email, String password){
        return userService.userExistsByEmailAndPass(email,password);
    }
}
