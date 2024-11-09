package com.pratik.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.model.Student;
import com.pratik.repo.StudentRepository;

@Service
public class StudentService {
	StudentRepository repo;
	
	public StudentRepository getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepository repo) {
		this.repo = repo;
	}

	public void addStudent(Student s) {
		repo.save(s);
	}
	
	public List<Student> getStudents(){
		return repo.findAll();
	}
}
