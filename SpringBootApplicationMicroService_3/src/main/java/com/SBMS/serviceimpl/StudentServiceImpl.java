package com.SBMS.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SBMS.model.Student;
import com.SBMS.repository.StudentRepository;
import com.SBMS.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public Student updateStudent(Student s) {
	Student student = sr.save(s);
		return student;
	}

		
}
