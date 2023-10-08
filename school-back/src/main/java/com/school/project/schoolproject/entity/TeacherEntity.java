package com.school.project.schoolproject.entity;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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


    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "course_id")
    private CourseEntity course;

    @ManyToOne
    @JoinColumn (name = "unidade_id")
    private UnitiesEntity unidades; 

}
