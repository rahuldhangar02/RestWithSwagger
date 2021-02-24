package com.swager.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swager.model.Category;
import com.swager.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	@Query("select p.pname,c.cname from Product p inner join Category c on p.cid=c.cid")
	public List<Product> getListInfo();
	
	
}
