package com.swager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swager.Repository.StudentRepository;
import com.swager.model.Student;

@Service
public class StudentService {

	
	 @Autowired
	 private StudentRepository studRepo;
	 
	 // list all student
	 public List<Student> getAllStudent()
	 {
		 return studRepo.findAll();
	 }
	 
	 // add Student 
	 public Student addStudent(Student s)
	 {
		 Student student = null;
		 if(student.getName().isEmpty())
		 {
			 
		 }
		 return studRepo.save(s);

	 }
	   // delete Records..
	 
	public Optional<Student> getStudentById(int id)
	{
		
		return studRepo.findById(id);
	}
	 
	//
	public void deleteStudent(int id)
	{
		studRepo.deleteById(id);
	}
	
}
