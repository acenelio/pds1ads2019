package com.educandoweb.course.dto;

import java.io.Serializable;
import java.time.Instant;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Payment;

public class PaymentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private Long orderId;
	
	public PaymentDTO() {
	}

	public PaymentDTO(Long id, Instant moment, Long orderId) {
		this.id = id;
		this.moment = moment;
		this.orderId = orderId;
	}

	public PaymentDTO(Payment entity) {
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.orderId = entity.getOrder().getId();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Payment toEntity() {
		Order order = new Order(orderId, null, null, null);
		return new Payment(id, moment, order);
	}
}
