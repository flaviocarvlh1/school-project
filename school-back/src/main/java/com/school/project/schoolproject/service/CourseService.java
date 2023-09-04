package com.school.project.schoolproject.service;

import java.util.List;

import com.school.project.schoolproject.entity.CourseEntity;

public interface CourseService {

   List<CourseEntity> findAll();

   CourseEntity inserir(CourseEntity ce);

   void deleteCourse(Long id);
    
}
