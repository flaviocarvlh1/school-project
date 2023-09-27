package com.school.project.schoolproject.entity;









import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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

    @OneToOne (mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    private TeacherEntity teacher;

    @ManyToMany
    @JoinTable( 
        name = "student_course",
        joinColumns = { @JoinColumn(name = "student_id")},
        inverseJoinColumns = { @JoinColumn(name = "course_id")}

    )
    private Set<StudentEntity> students;

    

 
}


