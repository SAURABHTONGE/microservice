package com.SBMS.service;


import java.util.List;

import com.SBMS.model.Student;

public interface StudentService {

	Student getSingleStudent(int id);

	List<Student> getAllStudent();

}
