package com.example.demo.controller;
import com.example.demo.service.LoginService;
import com.example.demo.service.entity.LoginRequest;
import com.example.demo.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
//    @CrossOrigin
    public boolean save(@RequestBody LoginRequest loginRequest){
        return loginService.userExistsByEmailAndPass(loginRequest.getEmail(),loginRequest.getPassword());
    }
}
