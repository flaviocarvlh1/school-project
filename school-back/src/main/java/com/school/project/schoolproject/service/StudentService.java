package com.school.project.schoolproject.service;

import java.util.List;

import com.school.project.schoolproject.entity.StudentEntity;

public interface StudentService {
    
    List<StudentEntity> findAllStudents();

    StudentEntity inserir(StudentEntity ade);

    void deleteStudent(Long id);
}
