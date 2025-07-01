package com.example.SpringBootRestAPIProject.Service;

import com.example.SpringBootRestAPIProject.Dto.StudentLocationDto;
import com.example.SpringBootRestAPIProject.entity.Student;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface StudentService {


  public List<Student> getAllDetails();
  public Optional<Student> getdDetailwithid(int id);
  public void addDetails(Student student);
  public void updateDetails(Student student, int id);
  public void deleteDetails(int id);
  public List<StudentLocationDto> getAllStudentLocation();


}
