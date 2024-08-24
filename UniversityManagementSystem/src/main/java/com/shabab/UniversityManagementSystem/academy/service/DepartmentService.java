package com.shabab.UniversityManagementSystem.academy.service;


import com.shabab.SecondSpringBoot.department.entity.Department;
import com.shabab.SecondSpringBoot.department.repository.DepartmentRepository;
import com.shabab.SecondSpringBoot.faculty.entity.Faculty;
import com.shabab.SecondSpringBoot.faculty.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private FacultyRepository facultyRepository;

    public void saveDepartment(Department department) {
        Faculty faculty = facultyRepository.findById(department.getFaculty().getId())
                .orElseThrow(
                        () -> new RuntimeException("Faculty not found")
                );
        department.setFaculty(faculty);
        departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

}
