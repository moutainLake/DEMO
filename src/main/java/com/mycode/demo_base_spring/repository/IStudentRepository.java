package com.mycode.demo_base_spring.repository;

import com.mycode.demo_base_spring.model.dao.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {


}
