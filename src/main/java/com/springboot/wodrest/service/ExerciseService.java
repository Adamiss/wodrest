package com.springboot.wodrest.service;

import com.springboot.wodrest.entity.Exercise;

import java.util.List;

public interface ExerciseService {

    public List<Exercise> findAll();
    public Exercise findById(int theId);
    public void save (Exercise theExercise);
    public void deleteById(int theId);
}
