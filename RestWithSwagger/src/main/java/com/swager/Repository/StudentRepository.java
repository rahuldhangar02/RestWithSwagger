package com.swager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swager.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
