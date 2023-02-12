package com.web.app.service;

import com.web.app.models.User;
import com.web.app.repositories.UserRepo;
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
