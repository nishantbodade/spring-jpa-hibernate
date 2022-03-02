package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

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

    @Override
    public List<Registration> findAll() {
        List<Registration> registrations=entityManager.createQuery("select r from Registration r").getResultList();
        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {

        List<RegistrationReport> registrationsReports=entityManager.createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();
        return registrationsReports;
    }
}
