package com.shabab.SecondSpringBoot.student.entity;

import com.shabab.SecondSpringBoot.department.entity.Department;
import com.shabab.SecondSpringBoot.faculty.entity.Faculty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true, length = 11)
    private String cell;

    private String gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth; // java.sql.Date

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
    private Department department;
}
