package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "list_tasks_id", referencedColumnName="id")
    private ListTasks listTasks;

    public int getId() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ListTasks getListTasks() {
        return listTasks;
    }


    public void setListTasks(ListTasks listTasks) {
        this.listTasks = listTasks;
    }


    public Task() {
    }


}
