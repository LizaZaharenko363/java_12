package com.example.model;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "MyEntity.findAll", query = "SELECT e FROM MyEntity e")
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}