package com.springboot.wodrest.dao;

import com.springboot.wodrest.entity.TypeOfWOD;

import java.util.List;

public interface TypeOfWODDAO {
    public List<TypeOfWOD> getAll();
    public TypeOfWOD findById(int theId);
    public void save (TypeOfWOD theTypeOfWOD);
    public void deleteById(int theId);
}
