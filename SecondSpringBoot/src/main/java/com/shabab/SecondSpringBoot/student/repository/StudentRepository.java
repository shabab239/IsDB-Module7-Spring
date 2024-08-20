package com.shabab.SecondSpringBoot.student.repository;

import com.shabab.SecondSpringBoot.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
