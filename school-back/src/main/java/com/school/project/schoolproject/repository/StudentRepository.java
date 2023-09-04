package com.school.project.schoolproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.project.schoolproject.entity.StudentEntity;


public interface StudentRepository extends CrudRepository<StudentEntity, Long> {


}