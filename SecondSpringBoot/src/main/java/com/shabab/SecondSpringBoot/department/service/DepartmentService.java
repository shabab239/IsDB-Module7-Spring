package com.shabab.SecondSpringBoot.department.service;


import com.shabab.SecondSpringBoot.department.entity.Department;
import com.shabab.SecondSpringBoot.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(Department department) {
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
