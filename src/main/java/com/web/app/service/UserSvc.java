package com.web.app.service;

import com.web.app.models.User;
import com.web.app.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSvc {

    @Autowired
    private UserRepo userRepo;

    public User findById(Long id) throws Exception {
        return userRepo.findById(id).orElseThrow(Exception::new);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

}
