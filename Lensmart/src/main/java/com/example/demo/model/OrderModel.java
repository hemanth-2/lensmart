package com.example.demo.model;


import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderModel")
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String orderId;
	private String userId;
	private String totalPrice;
	@OneToMany(targetEntity=OrderItems.class,cascade=CascadeType.ALL)
	@JoinColumn(name="order_Id",referencedColumnName="orderId")
	private List<OrderItems> orderItems;
	private String Status;
	public OrderModel() {
	}
	public OrderModel(String orderId, String userId, String totalPrice, List<OrderItems> orderItems,String Status) {
		this.orderId = orderId;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.orderItems = orderItems;
		this.Status = Status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}	

}
