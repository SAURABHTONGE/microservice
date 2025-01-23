package com.SBMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBMS.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> save(List<Student> s);

	
}
