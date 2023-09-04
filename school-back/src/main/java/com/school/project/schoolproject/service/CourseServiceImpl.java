package com.school.project.schoolproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.schoolproject.entity.CourseEntity;
import com.school.project.schoolproject.repository.CourseRepository;


@Service
public class CourseServiceImpl  implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override

    public List<CourseEntity> findAll() {
        return (List<CourseEntity>) courseRepository.findAll();

    }

    @Override
    public CourseEntity inserir(CourseEntity ce) {

        return courseRepository.save(ce);
        
        
    }

    @Override
    public void deleteCourse(Long id) {
       courseRepository.deleteById(id);
    }

    
    
    
}
