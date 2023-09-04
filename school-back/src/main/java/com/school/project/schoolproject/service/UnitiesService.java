package com.school.project.schoolproject.service;

import java.util.List;

import com.school.project.schoolproject.entity.UnitiesEntity;

public interface UnitiesService {
    
    List<UnitiesEntity> findAll();

    UnitiesEntity inserir(UnitiesEntity und);

    void deleteUnities(Long id);

    UnitiesEntity update(Long id, String name);


}
