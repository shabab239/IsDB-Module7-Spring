package com.shabab.UniversityManagementSystem.academy.restcontroller;

import com.shabab.SecondSpringBoot.student.entity.Student;
import com.shabab.SecondSpringBoot.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public ResponseEntity<List<Student>> list() {
        List<Student> studentList = studentService.getAllStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>("Saved Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentService.saveStudent(student);
    }
}
