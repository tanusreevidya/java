package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String categoryName;
	private long productPrice;
	private int productQuantity;
	private String productBrief;

	public Product() {
		super();
	}

	public Product(int productid, String productName, String categoryName, long productPrice, int productQuantity,
			String productBrief) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.categoryName = categoryName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productBrief = productBrief;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductBrief() {
		return productBrief;
	}

	public void setProductBrief(String productBrief) {
		this.productBrief = productBrief;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", productBrief="
				+ productBrief + "]";
	}
}