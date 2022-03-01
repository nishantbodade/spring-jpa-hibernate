package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Course save(Course course){
        entityManager.persist(course);
        return course;
    }
}
