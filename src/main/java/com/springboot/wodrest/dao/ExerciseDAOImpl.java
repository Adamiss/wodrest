package com.springboot.wodrest.dao;

import com.springboot.wodrest.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ExerciseDAOImpl  implements ExerciseDAO{

    private EntityManager entityManager;

    @Autowired
    public ExerciseDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    public List<Exercise> getAll() {
        return null;
    }

    @Override
    public Exercise findById(int theId) {
        return null;
    }

    @Override
    public void save(Exercise theExercise) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
