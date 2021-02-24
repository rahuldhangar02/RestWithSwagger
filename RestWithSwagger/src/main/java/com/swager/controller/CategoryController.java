package com.swager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swager.Repository.CategoryRepository;
import com.swager.Repository.ProductRepository;
import com.swager.dto.CategoryDto;
import com.swager.dto.OrderRequest;
import com.swager.model.Category;
import com.swager.model.Product;
import com.swager.service.CategoryService;

@RestController
@RequestMapping("/cat")
public class CategoryController {

	  @Autowired
	  private CategoryRepository catRepo;
	  
	  @Autowired 
	  private  ProductRepository proRepo;
	  
	  
	  
	  
	  // get All Data
	  @GetMapping("/views")
	  public List<Category> getAllCategory()
	  {
		  return catRepo.findAll();
	  }
	  // save Data
	  
	  @PostMapping("/saveCategory")
	  public Category saveCategory(@RequestBody OrderRequest request)
	  {
		  return catRepo.save(request.getCat());	 	
		  
	  }
	  
	  @GetMapping("/getinfo")
	  public List<Product> getInfomation()
	  {
		  
		  return proRepo.getListInfo();
	  }
	   
	
	  
}
