package com.school.project.schoolproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.schoolproject.entity.TeacherEntity;
import com.school.project.schoolproject.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{
    
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<TeacherEntity> findAll() {
        return (List<TeacherEntity>) teacherRepository.findAll();
    }

    @Override
    public TeacherEntity inserir(TeacherEntity ade) {

        return teacherRepository.save(ade);
}
    @Override
    
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);

    }
}


