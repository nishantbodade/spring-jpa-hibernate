package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;

import javax.transaction.Transactional;

public interface RegistartionRepository {
    @Transactional
    Registration save(Registration registration);
}
