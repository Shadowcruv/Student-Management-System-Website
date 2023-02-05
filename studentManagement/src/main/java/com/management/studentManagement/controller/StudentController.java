package com.management.studentManagement.controller;

import com.management.studentManagement.entity.Student;
import com.management.studentManagement.repository.StudentRepository;
import com.management.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/page")
    public String getAllstudents(Model model){
       model.addAttribute("students",studentService.getAllPupils());
         return "letsGo";
    }

    @GetMapping("/students/new")
    public String addStudent(Model model){

        Student student = new Student();
        model.addAttribute("studentm",student);
        return "createStudents";
    }

    @PostMapping("/save/students")
    public String saveStudent(@ModelAttribute("studentm") Student student){

         studentService.save(student);
        return "redirect:/page";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable Long id, Model model){

        Student student = studentService.getStudent(id);
        model.addAttribute("studentp", student);
        return "updateStudent";

    }


    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentService.deleteById(id);
        return "redirect:/page";

    }


}


































































/*@GetMapping("/page")
    public String getAllstudents(Model model){

        Student student1 = new Student("Miracle", "Nnaemeka", "miracle619@gmail.com");
        Student student2 = new Student("Kosi", "Anowi", "kosianowi@gmail.com");
        Student student3 = new Student("Ednah", "Igwe", "ednah@gmail.com");
        Student student4 = new Student("Lilian", "Onwe", "onwe@gmail.com");

        List<Student> peopleLists = new ArrayList<>();
        peopleLists.add(student1); peopleLists.add(student2); peopleLists.add(student3); peopleLists.add(student4);


        model.addAttribute("students",peopleLists);
        return "allStudents";
    }

     */