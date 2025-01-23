package com.SBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SBMS.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService si;
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		si.deleteStudent(id);
		return "Student Data Deleted!!";
		
	}
	
}
