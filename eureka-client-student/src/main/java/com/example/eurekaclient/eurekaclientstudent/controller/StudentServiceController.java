package com.example.eurekaclient.eurekaclientstudent.controller;

import com.example.eurekaclient.eurekaclientstudent.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/student")
@RestController
public class StudentServiceController {

    @GetMapping(value = "/getStudentDetails")
    public List<StudentDTO> getStudents() {
        System.out.println("Getting Student details :");
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("Sajal", "Class IV"));
        studentList.add(new StudentDTO("Lokesh", "Class V"));
        return studentList;
    }

}
