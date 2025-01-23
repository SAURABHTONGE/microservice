package com.SBMS.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	public Student getSingleStudent(int id) {
		Optional<Student> optional = sr.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			return student;
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = sr.findAll();
		
		return list;
	}
	
	
}
