package com.example.demo.service.entity;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
