package com.web.app.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @CreatedBy
    private Long createBy;

    @CreatedDate
    private LocalDateTime createTime;

    @LastModifiedBy
    private Long updateBy;

    @LastModifiedDate
    private LocalDateTime updateTime;

}
