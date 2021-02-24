package com.swager.model;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="category")
public class Category {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int cid;
	  private String cname;
	  
	  @OneToMany(mappedBy = "cat")
	  private List<Product> product;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Category(int cid, String cname, List<Product> product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", product=" + product + "]";
	}

	

	  
	  
	  
	   
	  
}
