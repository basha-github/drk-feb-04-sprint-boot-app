package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	
	@Autowired
	StudentRepo stuRepo;

	public void saveNewStudent(Student stuData) {
		
		stuRepo.save(stuData);
	}

	public Student fetchStudent(int rollno) {
		
		return stuRepo.findById(rollno).orElse(new Student());
	}

}
