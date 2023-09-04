package com.school.project.schoolproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.project.schoolproject.entity.TeacherEntity;

public interface TeacherRepository extends CrudRepository<TeacherEntity, Long> {

    
}
