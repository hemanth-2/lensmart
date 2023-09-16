package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cart")
public class CartModel {
    // Entity fields, annotations, constructors, getters, and setters
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long cartItemID;
        
	    private String productName;
	    

	    private String userId;
	    

	    private String price;
	    

	    private String quantity;
	    
	
	    private String imageUrl;

		public CartModel(Long cartItemID, String productName, String userId, String price, String quantity,
				String imageUrl) {
			
			this.cartItemID = cartItemID;
			this.productName = productName;
			this.userId = userId;
			this.price = price;
			this.quantity = quantity;
			this.imageUrl = imageUrl;
		}

		public CartModel() {
			
		}

		public Long getCartItemID() {
			return cartItemID;
		}

		public void setCartItemID(Long cartItemID) {
			this.cartItemID = cartItemID;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	    
	    
}
