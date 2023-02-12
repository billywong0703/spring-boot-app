package com.springBootApp.repositories;

import com.springBootApp.models.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends BaseRepo<Role, Long> {

}