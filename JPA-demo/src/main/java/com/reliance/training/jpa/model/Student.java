package com.reliance.training.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_DATA")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String city;
	private String branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student() {

	}

	public Student(int id, String name, String email, String city, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", branch=" + branch
				+ "]";
	}

}
