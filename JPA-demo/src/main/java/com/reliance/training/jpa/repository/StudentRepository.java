package com.reliance.training.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reliance.training.jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student getStudentByName(String name);
}
