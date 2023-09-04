package com.school.project.schoolproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.schoolproject.entity.UnitiesEntity;
import com.school.project.schoolproject.repository.UnitiesRepository;

@Service

public class UnitiesServiceImpl implements UnitiesService {

    @Autowired
    private UnitiesRepository unitiesRepository;

    @Override
    public List<UnitiesEntity> findAll() {

        return (List<UnitiesEntity>) unitiesRepository.findAll();

    }

    @Override
    public UnitiesEntity inserir(UnitiesEntity und) {
        return unitiesRepository.save(und);
    }

    @Override

    public void deleteUnities(Long id) {
        unitiesRepository.deleteById(id);
    }

    @Override
    public UnitiesEntity update(Long id, String name) {

        UnitiesEntity newUnities = new UnitiesEntity();
        return unitiesRepository.findById(id).map(item -> {
            item.setName(name);
            return unitiesRepository.save(item);
        }).orElseGet(() -> {
            newUnities.setId(id);

            
            return unitiesRepository.save(newUnities);
        });

    }
}
