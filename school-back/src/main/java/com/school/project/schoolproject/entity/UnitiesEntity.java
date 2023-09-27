package com.school.project.schoolproject.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.Data;

@Entity
@Data
@Table(name="unidades")


public class UnitiesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @NotBlank (message = "Name may not be null")
    private String name;

    @OneToMany(mappedBy = "unidades")
    private Set<TeacherEntity> teacher = new HashSet<>();

    
    
}

