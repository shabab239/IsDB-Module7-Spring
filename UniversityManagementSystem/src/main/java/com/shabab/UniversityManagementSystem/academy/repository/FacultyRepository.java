package com.shabab.UniversityManagementSystem.academy.repository;

import com.shabab.SecondSpringBoot.faculty.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
