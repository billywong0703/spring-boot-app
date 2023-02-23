package com.springBootApp.repositories;

import com.springBootApp.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends BaseRepo<User, Long> {
}
