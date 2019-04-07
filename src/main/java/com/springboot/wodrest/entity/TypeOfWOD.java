package com.springboot.wodrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "typeofwod")
public class TypeOfWOD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "name")
    private String name;

    public TypeOfWOD(){}

    public TypeOfWOD(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TypeOfWOD{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
