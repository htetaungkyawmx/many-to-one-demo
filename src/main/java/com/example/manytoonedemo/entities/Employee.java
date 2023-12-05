package com.example.manytoonedemo.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
// many - one
@Entity  // many
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String age;
    private String experties;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Department department;

    public Employee() {
    }

    public Employee(String name, String age, String experties) {
        this.name = name;
        this.age = age;
        this.experties = experties;
    }

    public Integer getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperties() {
        return experties;
    }

    public void setExperties(String experties) {
        this.experties = experties;
    }
}
