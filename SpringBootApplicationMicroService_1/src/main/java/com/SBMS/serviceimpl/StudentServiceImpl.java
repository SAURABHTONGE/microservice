package com.SBMS.serviceimpl;

import java.util.List;

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
	public void addSingleStudent(Student s) {
		sr.save(s);
	}

	
	@Override
	public void addAllStudent(List<Student> s) {
		for(Student l1:s) {
		sr.save(l1);
		}
	
	}

}
