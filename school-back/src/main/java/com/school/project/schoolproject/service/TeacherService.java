package com.school.project.schoolproject.service;

import java.util.List;

import com.school.project.schoolproject.entity.TeacherEntity;

public interface TeacherService {
    
   List<TeacherEntity> findAll();

   
   TeacherEntity inserir(TeacherEntity ade);

   void deleteTeacher(Long id);

}
