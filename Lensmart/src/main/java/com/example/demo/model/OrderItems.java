package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="OrderItems")
public class OrderItems {
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String OrderItemsId;
	private String ProductName;
	private int quantity;
	private String Price;
	public OrderItems() {
		
	}
	public OrderItems(String OrderItemsId, String ProductName, int quantity, String Price) {
		this.OrderItemsId = OrderItemsId;
		this.ProductName = ProductName;
		this.quantity = quantity;
		this.Price = Price;
	}
	public String getOrderItemsId() {
		return OrderItemsId;
	}
	public void setOrderItemsId(String orderItemsId) {
		OrderItemsId = orderItemsId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}

}
