package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="supplier")
public class Supplier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -895281684363383332L;
	@Id
	@GeneratedValue
	private int supplierId;
	private String supplierName;
	private String productName;
	private String categoryName;

	public Supplier() {

	}

	public Supplier(int supplierId, String supplierName, String productName, String categoryName) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.productName = productName;
		this.categoryName = categoryName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", productName=" + productName
				+ ", categoryName=" + categoryName + "]";
	}
}