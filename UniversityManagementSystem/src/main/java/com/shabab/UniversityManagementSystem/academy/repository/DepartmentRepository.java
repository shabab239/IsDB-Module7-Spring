package com.shabab.UniversityManagementSystem.academy.repository;

import com.shabab.SecondSpringBoot.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
