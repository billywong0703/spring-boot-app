package com.web.app.repositories;

import com.web.app.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends BaseRepo<User, Long> {
}
