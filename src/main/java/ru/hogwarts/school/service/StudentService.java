package ru.hogwarts.school.service;

import org.springframework.web.bind.annotation.RequestParam;
import ru.hogwarts.school.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(long id);

    Student editStudent(Student student);

    Student deleteStudent(long id);

    List<Student> filterAllByAge ( int age);
}
