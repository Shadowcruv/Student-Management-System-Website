package com.management.studentManagement.service;

import com.management.studentManagement.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> getAllPupils();

    Student save(Student student);

    Student getStudent(Long id);

    void deleteById(Long id);
}
