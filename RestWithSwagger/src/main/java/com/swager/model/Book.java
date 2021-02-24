package com.swager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookinfo")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String name;
	private String description;
	private String yearOfPublication;
	private String bookType;
	
	
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Book(int id, String name, String description, String yearOfPublication, String bookType) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.yearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}






	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description=" + description + ", yearOfPublication=" + yearOfPublication
				+ ", bookType=" + bookType + "]";
	}
	
	
	
	
	
}
