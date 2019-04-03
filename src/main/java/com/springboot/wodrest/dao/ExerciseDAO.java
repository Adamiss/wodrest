package com.springboot.wodrest.dao;

import com.springboot.wodrest.entity.Exercise;

import java.util.List;

public interface ExerciseDAO {

    public List<Exercise> getAll();
    public Exercise findById(int theId);
    public void save (Exercise theExercise);
    public void deleteById(int theId);
}
