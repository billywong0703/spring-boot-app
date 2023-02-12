package com.springBootApp.service;

import com.springBootApp.models.User;
import com.springBootApp.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSvc {

    @Autowired
    private UserRepo userRepo;

    public User getById() throws Throwable {
        return userRepo.findById(1L).orElseThrow(Throwable::new);
    }

}
