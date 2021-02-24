package com.swager.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int pid;
	private String pname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private Category cat;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	public Product(int pid, String pname, Category cat) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cat = cat;
	}





	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	

	public Category getCat() {
		return cat;
	}





	public void setCat(Category cat) {
		this.cat = cat;
	}





	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cat=" + cat + "]";
	}





	

	
	
	
}
