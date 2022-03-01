package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Course;
import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.repository.CourseRepository;
import com.pluralsight.conference.repository.RegistartionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistartionRepository registartionRepository;
    @Autowired
    CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration){
        registration= registartionRepository.save(registration);

        Course course=new Course();
        course.setName("Intro");
        course.setDescription("every one attends");
        course.setRegistration(registration);
        courseRepository.save(course);

        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registartionRepository.findAll();
    }
}
