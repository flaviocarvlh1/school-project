package com.school.project.schoolproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.schoolproject.entity.StudentEntity;
import com.school.project.schoolproject.service.StudentService;

@RestController

@RequestMapping("/students")

public class Student {

    @Autowired
    StudentService studentService; 

    @GetMapping

    public List<StudentEntity> getAllStudents() {

        return studentService.findAllStudents();

    }

    @PostMapping

    public String saveStudent(@RequestBody StudentEntity ade) {
        studentService.inserir(ade);
        return "Student added successfully";
    }

    public String deleteStudent(@PathVariable("id") Long id) {

        studentService.deleteStudent(id);
        return "Student deleted successfully";

 }

}