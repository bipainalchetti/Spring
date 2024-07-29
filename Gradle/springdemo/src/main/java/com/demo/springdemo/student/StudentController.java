package com.demo.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(
            @RequestBody Student student
    ){
        return  service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable ("email") String email
    ){

        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudent(){
        return service.findAllStudent();

    }

    @DeleteMapping("/{email}")
    public void deleteStudent(
            @PathVariable ("email") String email
    ){
        service.delete(email);
    }
}
