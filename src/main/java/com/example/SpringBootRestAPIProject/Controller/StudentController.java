package com.example.SpringBootRestAPIProject.Controller;

import com.example.SpringBootRestAPIProject.entity.student;
import com.example.SpringBootRestAPIProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    @GetMapping("/students")
    public List<student> getAllStudents(){
        List<student> students = repo.findAll();

        return students;
    }

    @GetMapping("/students/{id}")
    public student getStudent(@PathVariable int id){
        return repo.findById(id).get();
    }

}
