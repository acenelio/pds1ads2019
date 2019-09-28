package com.educandoweb.course.dto;

import java.io.Serializable;

import com.educandoweb.course.entities.OrderItem;

public class OrderItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer quantity;
	private Double price;
	private Long productId;
	private String productName;
	private String productImgUrl;
	
	public OrderItemDTO() {
	}

	public OrderItemDTO(Integer quantity, Double price, Long productId, String productName, String productImgUrl) {
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.productName = productName;
		this.productImgUrl = productImgUrl;
	}

	public OrderItemDTO(OrderItem entity) {
		if (entity.getProduct() == null) {
			throw new IllegalArgumentException("Product was null");
		}
		this.quantity = entity.getQuantity();
		this.price = entity.getPrice();
		this.productId = entity.getProduct().getId();
		this.productName = entity.getProduct().getName();
		this.productImgUrl = entity.getProduct().getImgUrl();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImgUrl() {
		return productImgUrl;
	}

	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}
}
