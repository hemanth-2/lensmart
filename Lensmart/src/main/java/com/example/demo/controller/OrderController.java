package com.example.demo.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.OrderModel;
import com.example.demo.model.ProductModel;
import com.example.demo.repo.OrderModelRepo;
import com.example.demo.repo.ProductRepo;
import com.example.demo.model.OrderItems;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController { 
    @Autowired
	public OrderModelRepo orderModelRepository;
    @Autowired
    public ProductRepo repo;

@GetMapping("/orders")
	public List<OrderModel> getUserProducts(@RequestParam("userId") String userId) {
      List<OrderModel> orders=orderModelRepository.findByUserId(userId);      
       return orders;  
   }
	
@GetMapping("/admin/orders")
public List<OrderModel> getAllOrders() {
	return orderModelRepository.findAll();
}
	
@PostMapping("/saveOrders")
 public String placeOrder(@RequestBody OrderModel order)
 {
	double tPrice=0.0;
	for(OrderItems orderItems: order.getOrderItems()) {
		tPrice+=Double.valueOf(orderItems.getPrice());
		ProductModel prod=repo.findByProductName(orderItems.getProductName());
		prod.setQuantity(String.valueOf(Integer.parseInt(prod.getQuantity())-(orderItems.getQuantity())));
		repo.save(prod);
	}
	order.setTotalPrice(String.valueOf(tPrice));
	OrderModel savedOrder = orderModelRepository.save(order);

    orderModelRepository.save(savedOrder);

    return "cart items sent to orders" ;
}
@GetMapping("/orders/{id}")
public OrderModel getOrderById(@PathVariable String id)
{
	OrderModel order= orderModelRepository.findById(id).orElse(null);
	return order;
}
}
	 
