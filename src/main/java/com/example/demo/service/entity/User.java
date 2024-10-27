package com.example.demo.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
@Entity
@Data
@NoArgsConstructor
public class User {
    private @Id
    @GeneratedValue Long id;
    private  String userName;
    private String email;
    private String password;
}
