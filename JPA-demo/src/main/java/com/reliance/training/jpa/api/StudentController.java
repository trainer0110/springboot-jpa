package com.reliance.training.jpa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.training.jpa.model.Student;
import com.reliance.training.jpa.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/student")
	public void addStudent(@RequestBody Student st) {
		this.service.addStudent(st);
	}

	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return this.service.getAllStudent();
	}

	@GetMapping("/student/{studentName}")
	public Student getStudent(@PathVariable String studentName) {
		return this.service.getStudent(studentName);
	}

	//Update student branch
	
	//Delete student by name
}
