package com.swager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


import com.swager.Repository.EmployeeRepositiry;
import com.swager.model.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("api")
@Api(value="Employee Management System", description="Operations pertaining to employee in Employee Management System")
public class EmployeeController {

	@Autowired
	private EmployeeRepositiry empRepo;
	
	@ApiOperation(value = "View Employee List", response = List.class)
	
	@GetMapping("/list")
	public List<Employee> getAllUser()
	{
		return empRepo.findAll();
	
	}
	@ApiOperation(value = "Add an employee")
	@PostMapping("/employees")
	public Employee createEmployee(
	    @ApiParam(value = "Employee object store in database table", required = true)  @RequestBody Employee employee) {
	    return empRepo.save(employee);
	}
	
	/*
	 @DeleteMapping("/employees/{id}")
	 public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer employeeId)
	   throws ResourceNotFoundException {
	  Employee employee = empRepo.findById(employeeId)
	    .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

	  empRepo.delete(employee);
	  Map<String, Boolean> response = new HashMap<>();
	  response.put("Data Delete Succesfully..", Boolean.TRUE);
	  return response;
	 } 
	*/
	
	
	@ApiOperation(value = "Delete a Employye")
	
	@DeleteMapping("employee/{id}")
	public void deleteEmployeeById(@ApiParam(value = "delete Records by Id",required = true) @PathVariable("id") Integer eid)
	{
		Employee e=empRepo.findById(eid).get();
		empRepo.delete(e);
	}
	
	// find by Id
	@ApiOperation("Get Employee By Id")
	@GetMapping("/getemp/{id}")
	public Employee getById(@ApiParam(value = "please enter employee id") @PathVariable("id") int id)
	{
		Employee e=empRepo.findById(id).get();
		
		return e;
	}
	
	@ApiOperation("Update Employee Records..")
	@PutMapping("empupdate/{id}")
	public Employee updateEmpById(@RequestBody Employee emp,@PathVariable("id") int eid)
	{
		Employee e=empRepo.findById(eid).get();
		e.setEmailId(emp.getEmailId());
		e.setFirstName(emp.getLastName());
		e.setLastName(emp.getLastName());
		
		return empRepo.save(e);
	}
	
	

}
