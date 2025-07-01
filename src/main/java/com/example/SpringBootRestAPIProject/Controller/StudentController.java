package com.example.SpringBootRestAPIProject.Controller;

import com.example.SpringBootRestAPIProject.Dto.StudentLocationDto;
import com.example.SpringBootRestAPIProject.Service.Impl.StudentServiceImpl;
import com.example.SpringBootRestAPIProject.Service.StudentService;
import com.example.SpringBootRestAPIProject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService retriveData;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return retriveData.getAllDetails();
    }


    @GetMapping("/getById/{id}")
    public Optional<Student> getStudent(@PathVariable int id) {
        return retriveData.getdDetailwithid(id);
    }

    @PostMapping("/getAll/{id}")
        public void addStudent(@RequestBody Student student){

             retriveData.addDetails(student);
        }


    @PutMapping("/updateById/{id}")
        public void updateStudent(@PathVariable int id, @RequestBody Student student) {

        retriveData.updateDetails(student, id);
    }

    @DeleteMapping("/deleteMapping/{id}")
        public void deleteStudent(@PathVariable int id){
        retriveData.deleteDetails(id);
    }

    //controllers for dto
    @GetMapping("/student-location")
    public List<StudentLocationDto> getAllStudentLocation(){
        return retriveData.getAllStudentLocation();
    }


    }








