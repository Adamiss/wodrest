package com.springboot.wodrest.service;

import com.springboot.wodrest.dao.TypeOfWODDAO;
import com.springboot.wodrest.dao.TypeOfWODDAOImpl;
import com.springboot.wodrest.entity.TypeOfWOD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeOfWODServiceImpl implements TypeOfWODService {

    private TypeOfWODDAO typeOfWODDAO;

    @Autowired
    public TypeOfWODServiceImpl(TypeOfWODDAO theTypeOfWODDAO){
        typeOfWODDAO = theTypeOfWODDAO;
    }

    @Override
    @Transactional
    public List<TypeOfWOD> getAll() {
        return typeOfWODDAO.getAll();
    }

    @Override
    @Transactional
    public TypeOfWOD findById(int theId) {
        return typeOfWODDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(TypeOfWOD theTypeOfWOD) {
        typeOfWODDAO.save(theTypeOfWOD);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        typeOfWODDAO.deleteById(theId);
    }
}
