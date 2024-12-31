package com.mathewshereni.springB.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS= Arrays.asList(
            new Student(1,"mathew shereni"),
            new Student(2,"wilma shereni"),
            new Student(3,"Trishaan Shereni")
    );

    @GetMapping(path = "{StudentId}")
    public Student getStudent(@PathVariable("StudentId") Integer studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("student" + studentId +"Does not exist"));

    }
}
