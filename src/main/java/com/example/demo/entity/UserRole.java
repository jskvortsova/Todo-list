package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserRole {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "userRole")
    private List<User> role;

    public UserRole() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getRole() {
        return role;
    }

    public void setRole(List<User> role) {
        this.role = role;
    }

    public UserRole(String name) {
        this.name = name;
    }
}