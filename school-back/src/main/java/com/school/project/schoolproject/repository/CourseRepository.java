package com.school.project.schoolproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.project.schoolproject.entity.CourseEntity;

public interface CourseRepository extends CrudRepository<CourseEntity, Long>{
    
}
