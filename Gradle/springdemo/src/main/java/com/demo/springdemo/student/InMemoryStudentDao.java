package com.demo.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS = new ArrayList<>();

   public Student save(Student s) {

        STUDENTS.add(s);
        return s;
    }

    public List<Student> findAllStudent() {

        return STUDENTS;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public void delete(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
