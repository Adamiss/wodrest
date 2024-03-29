package com.springboot.wodrest.dao;

import com.springboot.wodrest.entity.Exercise;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ExerciseDAOImpl  implements ExerciseDAO{

    private EntityManager entityManager;

    @Autowired
    public ExerciseDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    public List<Exercise> getAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query <Exercise> theQuery = currentSession.createQuery("from Exercise", Exercise.class);

        List<Exercise> exercises = theQuery.getResultList();

        return exercises;
    }

    @Override
    public Exercise findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Exercise theExercise = currentSession.get(Exercise.class, theId);

        return theExercise;
    }

    @Override
    public void save(Exercise theExercise) {

        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theExercise);

    }

    @Override
    public void deleteById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Exercise where id= :exerciseId");
        theQuery.setParameter("exerciseId", theId);

        theQuery.executeUpdate();
    }
}
