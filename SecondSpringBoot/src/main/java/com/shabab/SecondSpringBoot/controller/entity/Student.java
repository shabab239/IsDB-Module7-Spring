package com.shabab.SecondSpringBoot.controller.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "students")
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
    private Date dateOfBirth;

}
