package com.mycode.demo_base_spring.model.service;

import com.mycode.demo_base_spring.model.dao.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    Student insertItem(Student student);
    void deleteId(Long id);
}
