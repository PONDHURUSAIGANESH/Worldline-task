package com.student.registration.student.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.registration.student.entity.Student;
import com.student.registration.student.repository.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/get-forms")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @PostMapping("/post-forms")
    public Student postStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
