package com.swager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.swager.dto.CategoryDto;
import com.swager.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

	@Query("from Category c order by c.cname")
	public List<Category> getAllCategory();
	
	@Query("from Category c where  c.cname=:cname order by c.cname")
	public List<Category> search(@RequestParam("cname") String cname);
	
	
	
	
}
