package com.web.app.controller;

import com.web.app.models.User;
import com.web.app.repositories.UserRepo;
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

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) throws Throwable {
        return userRepo.findById(id).orElseThrow(Throwable::new);
    }

    @GetMapping("/user")
    public String getUserById2() {
        return "test";
    }
}
