package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import com.example.demo.model.CartModel;

@Repository
public interface CartModelRepo extends JpaRepository<CartModel, Long> {
	
}
