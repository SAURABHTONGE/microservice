package com.SBMS.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SBMS.repository.StudentRepository;
import com.SBMS.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;


	@Override
	public void deleteStudent(int id) {
		sr.deleteById(id);
	}


		
}
