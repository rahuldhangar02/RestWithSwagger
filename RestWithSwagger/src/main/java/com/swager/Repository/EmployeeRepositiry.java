package com.swager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swager.model.Employee;

@Repository
public interface EmployeeRepositiry extends JpaRepository<Employee,Integer> {

}
