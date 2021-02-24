package com.swager.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int id;
	
	private String name;
	
	private Date birtDate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, Date birtDate) {
		super();
		this.id = id;
		this.name = name;
		this.birtDate = birtDate;
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

	public Date getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(Date birtDate) {
		this.birtDate = birtDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birtDate=" + birtDate + "]";
	}
	
	
	
}
