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

import com.school.project.schoolproject.entity.TeacherEntity;
import com.school.project.schoolproject.service.TeacherService;

@RestController

@RequestMapping ("/teachers")

public class Teacher {
    

   @Autowired
   TeacherService teacherService;

   @GetMapping

   public List<TeacherEntity> findAllTeachers() {

    return teacherService.findAll();

}

    @PostMapping

    public String saveTeacher(@RequestBody TeacherEntity ade){
        teacherService.inserir(ade);

        return "Teacher Saved";
    }

    @DeleteMapping ("/{id}")

    public String deleteTeacher(@PathVariable("id") long id){

       teacherService.deleteTeacher(id);
        return "Teacher Deleted";
    }

}
