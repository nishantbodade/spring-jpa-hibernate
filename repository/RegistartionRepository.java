package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistartionRepository {
    @Transactional
    Registration save(Registration registration);

    List<Registration> findAll();
}
