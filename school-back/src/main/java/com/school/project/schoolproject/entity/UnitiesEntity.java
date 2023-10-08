package com.school.project.schoolproject.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="unidades")
@AllArgsConstructor
@NoArgsConstructor


public class UnitiesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @NotBlank (message = "Name may not be null")
    private String name;

    @OneToMany(mappedBy = "unidades", fetch = FetchType.EAGER)
    private Set<TeacherEntity> teacher = new HashSet<>();

    
    
}

