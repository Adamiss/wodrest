package com.springboot.wodrest.dao;

import com.springboot.wodrest.entity.TypeOfWOD;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TypeOfWODDAOImpl implements TypeOfWODDAO {

    private EntityManager entityManager;

    @Autowired
    public TypeOfWODDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<TypeOfWOD> getAll(){

        Session currentSessio = entityManager.unwrap(Session.class);

        Query theQuery = currentSessio.createQuery("from TypeOfWOD", TypeOfWOD.class);

        List<TypeOfWOD> typeOfWODS = theQuery.getResultList();

        return typeOfWODS;
    }

    @Override
    public TypeOfWOD findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        TypeOfWOD typeOfWOD = currentSession.get(TypeOfWOD.class, theId);

        return typeOfWOD;
    }

    @Override
    public void save(TypeOfWOD theTypeOfWOD) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theTypeOfWOD);

    }

    @Override
    public void deleteById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query query = currentSession.createQuery("delete from TypeOfWOD where id= :typeOfWODiD");
        query.setParameter("typeOfWODiD", theId);
        query.executeUpdate();

    }
}
