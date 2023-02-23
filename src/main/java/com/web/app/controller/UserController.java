package com.web.app.controller;

import com.web.app.models.User;
import com.web.app.service.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserSvc userSvc;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) throws Throwable {
        return userSvc.findById(id);
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return userSvc.findAll();
    }
}
