package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Controller
public class studentController {
	
	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String add() {
		return "Hello World";
	}
	
	@RequestMapping("/addstudent")
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
}
