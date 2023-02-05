package com.management.studentManagement.example;

import com.management.studentManagement.entity.Student;
import com.management.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Example  {

 @Autowired
 private StudentRepository studentRepository;



   @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {


            Student student1 = new Student("Miracle", "Nnaemeka", "miracle619@gmail.com");
            Student student2 = new Student("Kosi", "Anowi", "kosianowi@gmail.com");
         //   Student student3 = new Student("Ednah", "Igwe", "ednah@gmail.com");
           // Student student4 = new Student("Lilian", "Onwe", "onwe@gmail.com");

            studentRepository.saveAll(List.of(student1, student2));
        return null;
    }




}
