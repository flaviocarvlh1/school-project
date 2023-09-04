package com.school.project.schoolproject.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "teacher")

public class TeacherEntity {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
   
    private Long id;
     @NotBlank (message = "Teacher name may not be null")
    private String name;
    private int age;
}
