package com.shabab.UniversityManagementSystem.academy.service;


import com.shabab.SecondSpringBoot.faculty.entity.Faculty;
import com.shabab.SecondSpringBoot.faculty.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public void saveFaculty(Faculty faculty) {
        facultyRepository.save(faculty);
    }

    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

    public Faculty getFacultyById(Long id) {
        return facultyRepository.findById(id).get();
    }

}
