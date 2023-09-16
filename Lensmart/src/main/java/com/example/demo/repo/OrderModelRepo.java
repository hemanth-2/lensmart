package com.example.demo.repo;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderModel;



public interface OrderModelRepo extends JpaRepository<OrderModel,String> {
	 
	List<OrderModel> findByUserId(String userid);

}
