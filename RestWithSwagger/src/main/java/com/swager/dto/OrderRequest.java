package com.swager.dto;





import com.swager.model.Category;


public class OrderRequest {

	
	private Category cat;

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(Category cat) {
		super();
		this.cat = cat;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "OrderRequest [cat=" + cat + "]";
	}
	
	

	
	
	
}
