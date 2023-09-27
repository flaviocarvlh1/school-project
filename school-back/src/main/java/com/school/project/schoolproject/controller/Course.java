package com.school.project.schoolproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.schoolproject.entity.CourseEntity;
import com.school.project.schoolproject.service.CourseService;

@RestController
@RequestMapping ("/courses")
public class Course {

    @Autowired
    CourseService courseService;

    @GetMapping
    
    public List<CourseEntity> getAllCourses() {

        return courseService.findAll();

}
    
    @PostMapping

    public String saveCourse(@RequestBody CourseEntity ce){
        courseService.inserir(ce);

        return "Course Saved";
    }

    @DeleteMapping ("/{id}")

    public String deleteCourse(@PathVariable("id") long id){

        courseService.deleteCourse(id);
        return "Course Deleted";
    }

    
}
