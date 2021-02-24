package com.swager.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.swager.Exception.UserNotFoundException;
import com.swager.model.Student;
import com.swager.service.StudentService;

@RestController
@RequestMapping("api/student/v1")
public class StudentController {

	
	@Autowired
	private StudentService studService;
	
	// view all student
	@GetMapping("/viewStudent")
	public List<Student> listStudent()
	{	
		return studService.getAllStudent();		
	}
	
	// add Data
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s)
	{
	   Student studValue=  studService.addStudent(s);
	   
	  URI location= ServletUriComponentsBuilder.fromCurrentContextPath()
	   .path("{/id}").buildAndExpand(studValue.getId()).toUri();
	   
	     return ResponseEntity.created(location).build();
	}
	/// get User not found Exception
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") int id)
	{
		Optional<Student> sdata=studService.getStudentById(id);
		  if(!sdata.isPresent())
			  throw new UserNotFoundException("User Not Found"+id);
		return sdata;
	}
	
	//
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable int id)
	{
		Optional<Student> sid=studService.getStudentById(id);
		
		  if(!sid.isPresent())
			  throw new UserNotFoundException("User Id is not Prsent"+id);
		  studService.deleteStudent(id);
			  		
	}
	
	
	
	
	
}
