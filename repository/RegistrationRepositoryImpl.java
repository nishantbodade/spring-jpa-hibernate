package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class RegistrationRepositoryImpl implements RegistartionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Registration save(Registration registration){
        entityManager.persist(registration);
        return registration;
    }
}
