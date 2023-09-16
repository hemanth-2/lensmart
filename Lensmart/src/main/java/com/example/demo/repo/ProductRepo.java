package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, String>{
	public ProductModel findByProductName(String productName);
}
