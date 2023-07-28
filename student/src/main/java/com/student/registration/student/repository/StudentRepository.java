package com.student.registration.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.registration.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
