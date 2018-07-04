package com.example.demo.entity;

import com.example.demo.dao.UserDto;

import javax.persistence.*;

@Entity
@Table(name = "Usr")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private UserRole userRole;

    public User() {

    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

}
