package com.reliance.training.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.training.jpa.model.Student;
import com.reliance.training.jpa.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	// To save data in my database
	public void addStudent(Student st) {
		repo.save(st);
	}

	// get all students
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	
	public Student getStudent(String studentName) {
		return repo.getStudentByName(studentName);
	}

}
