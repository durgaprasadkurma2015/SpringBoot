package com.example.H2_curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.H2_curd.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
