package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository  userRepository;

    public User save(User user){
        return this.userRepository.save(user);
    }

    public boolean userExistsByEmailAndPass(String email, String password){
       return userRepository.existsByEmailAndPassword(email, password);
    }

}
