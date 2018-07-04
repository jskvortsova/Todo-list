package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.List;


@Entity
public class ListTasks {
    @Id
    @GeneratedValue
    private int id;

    private String listName;

    @OneToMany(mappedBy = "listTasks")
    private List<Task> tasks;


    public ListTasks() {

    }



    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }





}
