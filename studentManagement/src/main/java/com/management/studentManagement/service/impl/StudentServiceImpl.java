package com.management.studentManagement.service.impl;

import com.management.studentManagement.entity.Student;
import com.management.studentManagement.repository.StudentRepository;
import com.management.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllPupils(){
       return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {

       return studentRepository.save(student);

    }

    @Override
    public Student getStudent(Long id) {

        return studentRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }


}
