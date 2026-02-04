package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	
	
	@PostMapping("/jntu/drk/stu/add")
	public String m1(@RequestBody Student stuData) {
		
		stuService.saveNewStudent(stuData);
		
		return "successfully added new Student";
	}
	

}
