package com.school.project.schoolproject.entity;










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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    @NotBlank (message = "Name may not be null")
    private String name; 
    private int inicio_date;
    private int fim_date;

    @OneToOne (mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private TeacherEntity teacher;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( 
        name = "student_course",
        joinColumns = { @JoinColumn(name = "student_id")},
        inverseJoinColumns = { @JoinColumn(name = "course_id")}

    )
    private Set<StudentEntity> students;

    

 
}


