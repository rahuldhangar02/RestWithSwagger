package com.swager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swager.model.ProductInfo;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Integer> {

}
