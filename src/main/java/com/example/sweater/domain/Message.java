package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public Message() {
    }

    public Message(String text, String email) {
        this.name = text;
        this.email = email;
    }

    public void setText(String text) {
        this.name = text;
    }

    public String getText() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return email;
    }

    public void setTag(String email) {
        this.email = email;
    }
}