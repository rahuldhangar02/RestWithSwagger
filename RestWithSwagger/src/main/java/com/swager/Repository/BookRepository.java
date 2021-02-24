package com.swager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.swager.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	
	// get All data
	@Query("from Book b order by b.name")
	public List<Book> getAllBook();
	
	// get Data by yop of publication
	@Query("from Book b where b.yearOfPublication=:yop")
	public List<Book> getBookByYearOfPublication(@RequestParam("yearOfPublication") String yop);
   
	 
	
	
	
	
}
