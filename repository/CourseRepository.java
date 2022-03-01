package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Course;

import javax.transaction.Transactional;

public interface CourseRepository {
    @Transactional
    Course save(Course course);
}
