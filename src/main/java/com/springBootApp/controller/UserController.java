package com.springBootApp.controller;

import com.springBootApp.models.User;
import com.springBootApp.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/test/{id}")
    public User getUserById(@PathVariable Long id) throws Throwable {
        return userRepo.findById(id).orElseThrow(Throwable::new);
    }

    @GetMapping("/test2")
    public String getUserById2() {
        return "test";
    }
}