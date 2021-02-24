package com.swager.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.swager.Exception.UserNotFoundException;
import com.swager.Repository.BookRepository;
import com.swager.model.Book;
import com.swager.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	
	   @Autowired
	   private BookService bookService;
	   
	   @Autowired
	   private BookRepository bookRepo;
	   
	   @GetMapping("/bookList")
	   public List<Book> getAllBook()
	   {   
		   return bookService.getAllBook();
	   }
	
	   //
	   @GetMapping("/bookList/{yearOfPublication}")
	   public List<Book> getAllBook(@PathVariable("yearOfPublication") String yop)
	   {   
		   List<Book> b=bookRepo.getBookByYearOfPublication(yop);
		   if(b==null)
			   throw new UserNotFoundException("User Not Found"+yop);
		  return b;
	   }
	   
	   // Get Data By yop
	 
	
	   @PostMapping("/addBook")
	   public ResponseEntity<Book> addBook(@RequestBody Book book)
	   {
		   Book b=bookService.addBook(book);
		   
		 URI location=  ServletUriComponentsBuilder
		   .fromCurrentContextPath()
		   .path("{id}")
		   .buildAndExpand(b.getId())
		   .toUri();
		   return ResponseEntity.created(location).build();
		   
	   }
	   
	   
}
