package com.SBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SBMS.model.Student;
import com.SBMS.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService si;
	
	@GetMapping("/get/{id}")
	public Student getSingleData(@PathVariable int id) {
	Student stu=	si.getSingleStudent(id);
		return stu;
	}
	@GetMapping("/get")
	public List<Student> getAllData(){
		List<Student> allStudent= si.getAllStudent();
		return allStudent;
	}
	
}
