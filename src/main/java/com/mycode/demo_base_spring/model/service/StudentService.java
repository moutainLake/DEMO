package com.mycode.demo_base_spring.model.service;

import com.mycode.demo_base_spring.model.dao.Student;
import com.mycode.demo_base_spring.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.of(studentRepository.findById(id).get());
    }

    @Override
    public Student insertItem(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteId(Long id) {
        studentRepository.deleteById(id);
    }
}
