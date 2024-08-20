package com.shabab.SecondSpringBoot.student.controller;

import com.shabab.SecondSpringBoot.student.entity.Student;
import com.shabab.SecondSpringBoot.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/saveStudentForm")
    public String saveStudentForm(Model model) {
        model.addAttribute("title", "Add Student");

        model.addAttribute("student", new Student());
        return "student/save_student_form";
    }

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student) {

        studentService.saveStudent(student);

        return "redirect:/studentList";
    }

    @RequestMapping(value = "/studentList")
    public String studentList(Model model) {
        model.addAttribute("title", "Student List");

        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("studentList", studentList);

        return "student/student_list";
    }

    @RequestMapping(value = "/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {

        studentService.deleteStudent(id);

        return "redirect:/studentList";
    }

    @RequestMapping("/editStudentForm/{id}")
    public String editStudentForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title", "Edit Student");

        Student student = studentService.getStudentById(id);

        model.addAttribute("student", student);

        return "student/save_student_form";
    }

}
