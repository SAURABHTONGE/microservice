package com.SBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SBMS.model.Student;
import com.SBMS.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService si;
	
	@PutMapping("update")
	public Student updateData(@RequestBody Student s) {
	Student stu=si.updateStudent(s);
		return stu;
		
	}
	
}
