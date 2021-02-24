package com.swager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swager.Repository.ProductRepository;
import com.swager.model.Category;
import com.swager.model.Product;
import com.swager.service.CategoryService;
import com.swager.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	  @Autowired
	  private ProductService proServcie;
	  
	  // get All Data
	  @GetMapping("/views")
	  public List<Product> getAllCategory()
	  {
		  return proServcie.getAllProduct();
	  }
	  // save Data
	  
	  @PostMapping("/saveProduct")
	  public Product saveCategory(@RequestBody Product pro)
	  {
		  return proServcie.addProduct(pro);
		  
		
		  
	  }
	   
	
	  
}
