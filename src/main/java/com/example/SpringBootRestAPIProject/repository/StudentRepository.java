package com.example.SpringBootRestAPIProject.repository;

import com.example.SpringBootRestAPIProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}


