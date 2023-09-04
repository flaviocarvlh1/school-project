package com.school.project.schoolproject.entity;









import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "course")
public class CourseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    @NotBlank (message = "Name may not be null")
    private String name; 
    private int inicio_date;
    private int fim_date;
}
