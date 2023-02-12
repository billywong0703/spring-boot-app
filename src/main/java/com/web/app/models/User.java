package com.web.app.models;

import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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

