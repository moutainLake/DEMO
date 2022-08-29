package com.mycode.demo_base_spring.controller;

import com.mycode.demo_base_spring.model.dao.Student;
import com.mycode.demo_base_spring.model.service.IStudentService;
import com.mycode.demo_base_spring.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    IStudentService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
