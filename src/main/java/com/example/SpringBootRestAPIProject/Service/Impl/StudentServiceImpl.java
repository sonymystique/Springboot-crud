package com.example.SpringBootRestAPIProject.Service.Impl;

import com.example.SpringBootRestAPIProject.Dto.StudentLocationDto;
import com.example.SpringBootRestAPIProject.Service.StudentService;
import com.example.SpringBootRestAPIProject.entity.Student;
import com.example.SpringBootRestAPIProject.repository.LocationRepository;
import com.example.SpringBootRestAPIProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LocationRepository locationRepository;
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

    //service for dpo location+ student



    public List<StudentLocationDto> getAllStudentLocation(){
        return studentRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private StudentLocationDto convertEntityToDto(Student student){
        StudentLocationDto studentLocationDto = new StudentLocationDto();
        studentLocationDto.setName(student.getName());
        studentLocationDto.setPlace(student.getLocation().getPlace());
        studentLocationDto.setLatitude(student.getLocation().getLatitude());
        studentLocationDto.setLongitude(student.getLocation().getLongitude());

        return studentLocationDto;

    }





}
