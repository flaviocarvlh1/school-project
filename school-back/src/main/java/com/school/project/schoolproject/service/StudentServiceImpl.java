package com.school.project.schoolproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.schoolproject.entity.StudentEntity;
import com.school.project.schoolproject.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{ 

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> findAllStudents() {    
        return (List<StudentEntity>) studentRepository.findAll();  
    }

    @Override
    public StudentEntity inserir(StudentEntity ade) {

        return studentRepository.save(ade);
       
    }

    @Override
    public void deleteStudent(Long id) {
       studentRepository.deleteById(id);
    }

 

    

}