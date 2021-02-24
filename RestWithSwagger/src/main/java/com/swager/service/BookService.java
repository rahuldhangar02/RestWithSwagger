package com.swager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swager.Repository.BookRepository;
import com.swager.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	/// get All Data
	public List<Book> getAllBook()
	{
		return bookRepo.getAllBook();
	}
	
	// get Data By year of publication
	public List<Book> getBookByYop(String yop)
	{
		
		return bookRepo.getBookByYearOfPublication(yop);
	}
	
	// save Data
	   public Book addBook(Book book)
	   {
		   return bookRepo.save(book);
		   
	   }
	
	
	
}
