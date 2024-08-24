package com.shabab.UniversityManagementSystem.academy.restcontroller;

import com.shabab.SecondSpringBoot.department.entity.Department;
import com.shabab.SecondSpringBoot.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/list")
    public List<Department> list() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/save")
    public void save(@RequestBody Department department) {
        departmentService.saveDepartment(department);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Department department) {
        departmentService.saveDepartment(department);
    }
}
