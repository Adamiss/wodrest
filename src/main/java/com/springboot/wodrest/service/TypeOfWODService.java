package com.springboot.wodrest.service;

import com.springboot.wodrest.entity.TypeOfWOD;

import java.util.List;

public interface TypeOfWODService {
    public List<TypeOfWOD> getAll();
    public TypeOfWOD findById(int theId);
    public void save (TypeOfWOD theTypeOfWOD);
    public void deleteById(int theId);
}
