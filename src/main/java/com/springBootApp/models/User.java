package com.springBootApp.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_user")
public class User extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private Long id;

        private String userName;

        private String password;

        private String email;

        private long phoneNumber;

        private String description;

        @ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
        @JoinTable(name = "tb_user_role", joinColumns = {
                @JoinColumn(name = "user_id")},
                inverseJoinColumns = {
                        @JoinColumn(name = "role_id")
                }
        )
        private Set<Role> roles;

}

