package com.example.SpringBootRestAPIProject.Service.Impl;

import com.example.SpringBootRestAPIProject.Service.StudentService;
import com.example.SpringBootRestAPIProject.entity.Student;
import com.example.SpringBootRestAPIProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllDetails(){
        return studentRepository.findAll();

    }

    public Optional<Student> getdDetailwithid(int id){
        return studentRepository.findById(id);
    }

    public void addDetails(Student student){

        studentRepository.save(student);



    }

    public void updateDetails(Student student, int id){

        studentRepository.findById(id)
                .map(details ->{
                    details.setName(student.getName());
                    details.setRollNo(student.getRollNo());
                    details.setBranch(student.getBranch());
                    details.setPercentage(student.getPercentage());

                    return studentRepository.save(details);
                })
                .orElse(null);

    }

    public void deleteDetails(int id){

        studentRepository.deleteById(id);
    }

}
