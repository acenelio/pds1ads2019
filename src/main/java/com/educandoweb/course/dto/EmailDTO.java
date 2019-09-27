package com.educandoweb.course.dto;

import java.io.Serializable;

public class EmailDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	
	public EmailDTO() {
	}

	public EmailDTO(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
