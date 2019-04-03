package com.springboot.wodrest.service;

import com.springboot.wodrest.dao.ExerciseDAO;
import com.springboot.wodrest.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private ExerciseDAO exerciseDAO;

    @Autowired
    public ExerciseServiceImpl(ExerciseDAO theExerciseDAO){
        exerciseDAO = theExerciseDAO;
    }

    @Override
    @Transactional
    public List<Exercise> findAll() {
        return exerciseDAO.getAll();
    }

    @Override
    @Transactional
    public Exercise findById(int theId) {
        return exerciseDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Exercise theExercise) {
        exerciseDAO.save(theExercise);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        exerciseDAO.deleteById(theId);
    }
}
