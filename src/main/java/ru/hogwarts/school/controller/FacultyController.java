package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;


import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @GetMapping  ("/{id}/get")
    public Faculty getFaculty(@PathVariable Long id){
     return facultyService.findFaculty(id);
    }
    @PostMapping ("/add")
    public Faculty createFaculty(Faculty faculty){
        return facultyService.createFaculty(faculty);
    }
    @PutMapping ("/{id}/edit")
    public  Faculty editFaculty(Faculty faculty){
     return facultyService.editFaculty(faculty);
    }
    @DeleteMapping ("/{id}/delete")
    public Faculty deliteFaculty(@PathVariable Long id){
        return facultyService.deleteFaculty(id);
    }
    @GetMapping ("/get/by-color")
    public List<Faculty> filterAllByColor(@RequestParam ("color") String color){
        return facultyService.filterAllByColor(color);
    }
}
