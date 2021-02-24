package com.swager.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.swager.Repository.ProductRepository;
import com.swager.model.Product;

@Service
public class ProductService {

	
	 private ProductRepository proRepository;
	
	 
	 //list All product
	 public List<Product> getAllProduct()
	 {
		 return proRepository.findAll();
		 
	 }
	 
	 // Save Product
	 
	 public Product addProduct(Product pro)
	 {
		 return proRepository.save(pro);
	 }
	 
	 
}
