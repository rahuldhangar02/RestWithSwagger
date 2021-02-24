package com.swager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swager.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
