package com.shabab.SecondSpringBoot.student.restController;

import com.shabab.SecondSpringBoot.student.entity.Student;
import com.shabab.SecondSpringBoot.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> list() {
        return studentService.getAllStudents();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentService.saveStudent(student);
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
