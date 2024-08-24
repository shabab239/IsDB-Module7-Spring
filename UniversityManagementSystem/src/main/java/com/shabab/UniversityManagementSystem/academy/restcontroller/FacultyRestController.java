package com.shabab.UniversityManagementSystem.academy.restcontroller;

import com.shabab.SecondSpringBoot.faculty.entity.Faculty;
import com.shabab.SecondSpringBoot.faculty.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
public class FacultyRestController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/list")
    public List<Faculty> list() {
        return facultyService.getAllFaculties();
    }

    @PostMapping("/save")
    public void save(@RequestBody Faculty faculty) {
        facultyService.saveFaculty(faculty);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Faculty faculty) {
        facultyService.saveFaculty(faculty);
    }
}
