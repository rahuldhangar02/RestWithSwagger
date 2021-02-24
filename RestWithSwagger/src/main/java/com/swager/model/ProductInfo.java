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
@Table(name="productinfo")
public class ProductInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private int qty;
	private int price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="cid")
	private Customer customer;

	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductInfo(int id, String productName, int qty, int price, Customer customer) {
		super();
		this.id = id;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", customer=" + customer + "]";
	}

	

}
