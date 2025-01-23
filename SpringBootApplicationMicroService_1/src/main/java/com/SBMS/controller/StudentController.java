package com.SBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SBMS.model.Student;
import com.SBMS.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService si;
	
	@PostMapping("/add")
	public String addSingleData(@RequestBody Student s) {
		si.addSingleStudent(s);
		return "Data Added Successfully!!";
	}
	@PostMapping("/addAll")
	public String addAllData(@RequestBody List<Student> s){
		   si.addAllStudent(s);
		return "Student added";
		
	}
}
