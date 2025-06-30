package com.example.SpringBootRestAPIProject.repository;

import com.example.SpringBootRestAPIProject.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Integer> {
}
