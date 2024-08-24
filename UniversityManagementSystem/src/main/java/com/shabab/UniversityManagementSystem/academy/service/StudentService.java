package com.shabab.UniversityManagementSystem.academy.service;


import com.shabab.SecondSpringBoot.department.entity.Department;
import com.shabab.SecondSpringBoot.department.repository.DepartmentRepository;
import com.shabab.SecondSpringBoot.student.entity.Student;
import com.shabab.SecondSpringBoot.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveStudent(Student student) {
        Department department = departmentRepository.findById(student.getDepartment().getId())
                        .orElseThrow(
                                () -> new RuntimeException("Department not found")
                        );
        student.setDepartment(department);
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

}
