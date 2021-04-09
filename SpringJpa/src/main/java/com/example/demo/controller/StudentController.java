package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("in Home");
		return "home.jsp";
	}
	
	
	@RequestMapping("/addstud")
	public String addStudent(Student stud) {
		System.out.println("in Home");
		repo.save(stud);
		return "home.jsp";
	}

	@RequestMapping("/getstud")
	public ModelAndView getStudent(@RequestParam Integer id) {
		ModelAndView mv=new ModelAndView("ShowStudent.jsp");
		System.out.println("get student");
		Student st=repo.findById(id).orElse(new Student());
		mv.addObject("obj",st);
		return mv;
	}

}
