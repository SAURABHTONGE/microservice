package com.SBMS.service;

import java.util.List;

import com.SBMS.model.Student;

public interface StudentService {

	void addSingleStudent(Student s);

	void addAllStudent(List<Student> s);

}
