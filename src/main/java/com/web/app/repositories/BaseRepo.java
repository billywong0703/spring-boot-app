package com.web.app.repositories;

import com.web.app.models.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepo<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {
}