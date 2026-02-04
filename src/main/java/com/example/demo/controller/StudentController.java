package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	
	
	@PostMapping("/jntu/drk/stu/add")
	public String m1(@RequestBody Student stuData) {
		
		stuService.saveNewStudent(stuData);
		
		return "successfully added new Student";
	}
	
	
	@GetMapping("/jntu/drk/exam/res")
	public Student getStudent(@RequestParam int rollno) {
		
		
		return stuService.fetchStudent(rollno);
	}

}
