package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;


import java.util.List;



@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping ("/{id}/get")
    public Student getStudent(@PathVariable("id") Long id){
        return studentService.findStudent(id);
    }
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @PutMapping ("/{id}/edit")
    public Student editStudent(@RequestBody Student student){
        return studentService.editStudent(student);
    }
    @DeleteMapping("/{id}/delete")
    public Student deleteStudent(@PathVariable("id") Long id){
        return studentService.deleteStudent(id);
    }
    @GetMapping ("/get/by-age")
    public List <Student> filterAllByAge (@RequestParam("age") int age){
        return studentService.filterAllByAge(age);
    }
}
