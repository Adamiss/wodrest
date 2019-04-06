package com.springboot.wodrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")              //TODO: Set to database the id as a PRIMARY KEY
    private int id;

    @Column(name = "name")
    private String name;

    // Define Constructors
    public Exercise(){}

    public Exercise(String name) {
        this.name = name;
    }

    // Define getters / setters
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

    // Define toString method
    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
