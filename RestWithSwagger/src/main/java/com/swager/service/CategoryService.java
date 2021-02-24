package com.swager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swager.Repository.CategoryRepository;
import com.swager.model.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catRepo;
	
	
	  // save all category
	 public List<Category> getAllCategory()
	 {
		 return catRepo.getAllCategory();
	 }
	  
	 public Category addCategory(Category cat)
	 {
		 return catRepo.save(cat);
		 
	 }
	
	 // search Data by id or name
	 public List<Category> searchByIdandName(String cname)
	 {
		 return catRepo.search(cname);
	 }
	
}
