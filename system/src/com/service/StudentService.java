package com.service;

import java.util.List;

import com.ORM.Student;

public interface StudentService {

	public Student get(String Id);

	public void update(Student student);

	public void save(Student student);

	public List<Student> getall();

}